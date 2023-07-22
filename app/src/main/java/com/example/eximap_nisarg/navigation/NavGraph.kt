package com.example.eximap_nisarg.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.composables.CommentsScreen
import com.example.eximap_nisarg.composables.FeedScreen
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable




@OptIn(ExperimentalPagingApi::class, ExperimentalAnimationApi::class)
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    feedScreenViewModel: FeedScreenViewModel,
){
    AnimatedNavHost(navController = navController, startDestination = RouteClass.Feed.route){
        composable(
            route = RouteClass.Feed.route,
            enterTransition = {slideInHorizontally(animationSpec = tween(500)) },
            exitTransition = {slideOutHorizontally(animationSpec = tween(500)) },
            popEnterTransition = { fadeIn(animationSpec = tween(400)) }
        ) {
            FeedScreen(feedScreenViewModel, navController)
        }

        composable(
            route = RouteClass.CommentsScreen.route,
            enterTransition = {slideInHorizontally(initialOffsetX = { it / 2 }, animationSpec = tween(500)) },
            exitTransition = {slideOutHorizontally(targetOffsetX = { it / 2 }, animationSpec = tween(500)) },
            popExitTransition = { fadeOut(animationSpec = tween(400)) }
        ){
            CommentsScreen(navController, feedScreenViewModel)
        }
    }

}