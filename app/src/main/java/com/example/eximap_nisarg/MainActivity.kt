package com.example.eximap_nisarg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.data.api.GrpcApi
import com.example.eximap_nisarg.data.room.PostDatabase
import com.example.eximap_nisarg.navigation.SetupNavGraph
import com.example.eximap_nisarg.repository.Repository
import com.example.eximap_nisarg.ui.theme.Eximap_NisargTheme
import com.example.eximap_nisarg.viewmodel.PostSharedViewModel
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModelFactory
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @OptIn(ExperimentalPagingApi::class)
    private lateinit var feedScreenViewModel: FeedScreenViewModel

    @OptIn(ExperimentalPagingApi::class, ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {

        feedScreenViewModel = ViewModelProvider(this,
            FeedScreenViewModelFactory(Repository(GrpcApi(),PostDatabase.getDatabase(this)))
        )[FeedScreenViewModel::class.java]

        super.onCreate(savedInstanceState)
        setContent {
            Eximap_NisargTheme {
                navController = rememberAnimatedNavController()
                SetupNavGraph(navController = navController, feedScreenViewModel)
            }
        }
    }
}
