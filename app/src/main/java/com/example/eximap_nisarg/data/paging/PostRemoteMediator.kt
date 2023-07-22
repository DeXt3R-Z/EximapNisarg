package com.example.eximap_nisarg.data.paging

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.example.eximap_nisarg.data.api.GrpcApi
import com.example.eximap_nisarg.data.room.PostDatabase
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.data.room.remote_keys.entities.PostRemoteKeys
import com.example.eximap_nisarg.util.Constants.Companion.PAGE_SIZE

@OptIn(ExperimentalPagingApi::class)
class PostRemoteMediator(
    private val grpcApi: GrpcApi,
    private val database: PostDatabase
): RemoteMediator<Int, PostDetails>() {

    private val postDao = database.postDao()
    private val remoteKeysDao = database.remoteKeysDao()

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, PostDetails>
    ): MediatorResult {
        return try {
            val currentPage = when (loadType) {
                LoadType.REFRESH -> {
                    val remoteKeys = getRemoteKeyClosestToCurrentPosition(state)
                    remoteKeys?.nextPage?.minus(1) ?: 0
                }
                LoadType.PREPEND -> {
                    val remoteKeys = getRemoteKeyForFirstItem(state)
                    val prevPage = remoteKeys?.prevPage
                        ?: return MediatorResult.Success(
                            endOfPaginationReached = remoteKeys != null
                        )
                    prevPage
                }
                LoadType.APPEND -> {
                    val remoteKeys = getRemoteKeyForLastItem(state)
                    val nextPage = remoteKeys?.nextPage
                        ?: return MediatorResult.Success(
                            endOfPaginationReached = remoteKeys != null
                        )
                    nextPage
                }
            }

            val apiResponseList = grpcApi.getFeedList(pageNum = currentPage, PAGE_SIZE)
            val endOfPaginationReached = apiResponseList.isEmpty()

            val prevPage = if (currentPage == 0) null else currentPage - 1
            val nextPage = if (endOfPaginationReached) null else currentPage + 1

            database.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    postDao.deleteItems()
                    remoteKeysDao.deleteAllRemoteKeys()
                }

                val keys = apiResponseList.map {
                    PostRemoteKeys(
                        postId = it.postId,
                        prevPage = prevPage,
                        nextPage = nextPage
                    )
                }
                remoteKeysDao.addAllRemoteKeys(remoteKeys = keys)

                val postDetailsList = apiResponseList.map { itemApiResponse->
                    PostDetails(
                        postId = itemApiResponse.postId,
                        postAuthorImage=itemApiResponse.authorInfo.photoUrl,
                        postAuthorName = itemApiResponse.authorInfo.name,
                        tags = if(itemApiResponse.tagsList.size>0) itemApiResponse.tagsList[0] else "",
                        createdOn = itemApiResponse.createdOn,
                        postTitle = itemApiResponse.post,
                        mediaList = itemApiResponse.mediaUrlsList,
                        numLikes = itemApiResponse.numLikes,
                        numReplies = itemApiResponse.numReplies
                    )
                }
                postDao.addPost(postDetailsList.toList())
            }
            MediatorResult.Success(endOfPaginationReached = endOfPaginationReached)
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }

    private suspend fun getRemoteKeyClosestToCurrentPosition(
        state: PagingState<Int, PostDetails>
    ): PostRemoteKeys? {
        return state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.postId?.let { id ->
                remoteKeysDao.getRemoteKeys(postId = id)
            }
        }
    }

    private suspend fun getRemoteKeyForFirstItem(
        state: PagingState<Int, PostDetails>
    ): PostRemoteKeys? {
        return state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.firstOrNull()
            ?.let {
                remoteKeysDao.getRemoteKeys(postId = it.postId)
            }
    }

    private suspend fun getRemoteKeyForLastItem(
        state: PagingState<Int, PostDetails>
    ): PostRemoteKeys? {
        return state.pages.lastOrNull { it.data.isNotEmpty() }?.data?.lastOrNull()
            ?.let {
                remoteKeysDao.getRemoteKeys(postId = it.postId)
            }
    }


}