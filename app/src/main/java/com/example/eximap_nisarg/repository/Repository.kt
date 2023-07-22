package com.example.eximap_nisarg.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.eximap_nisarg.data.api.GrpcApi
import com.example.eximap_nisarg.data.paging.PostRemoteMediator
import com.example.eximap_nisarg.data.room.PostDatabase
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.util.Constants.Companion.PAGE_SIZE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class Repository(private val api: GrpcApi, private val database: PostDatabase) {

    fun getAllPosts(): Flow<PagingData<PostDetails>> {
        val pagingSourceFactory = {database.postDao().getItems()}
        return Pager(
            config = PagingConfig(PAGE_SIZE),
            remoteMediator = PostRemoteMediator(api,database),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

}