package com.example.eximap_nisarg.viewmodel.feed_view_model

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.repository.Repository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@ExperimentalPagingApi
class FeedScreenViewModel  constructor(private var repoObj: Repository): ViewModel() {

    val getFeed = repoObj.getAllPosts()

    private var _commentPostState = MutableStateFlow<PostDetails?>(null)
    val commentPostState: StateFlow<PostDetails?> get() = _commentPostState

    fun updateCommentPostState(userPost: PostDetails){
        _commentPostState.value = userPost
    }

}