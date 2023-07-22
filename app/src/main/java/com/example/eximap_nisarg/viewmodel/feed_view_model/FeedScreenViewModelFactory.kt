package com.example.eximap_nisarg.viewmodel.feed_view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.repository.Repository

class FeedScreenViewModelFactory @OptIn(ExperimentalPagingApi::class) constructor(val repoObj: Repository): ViewModelProvider.Factory {

    @OptIn(ExperimentalPagingApi::class)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FeedScreenViewModel(repoObj) as T
    }

}