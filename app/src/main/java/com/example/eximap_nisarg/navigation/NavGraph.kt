package com.example.eximap_nisarg.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.composables.CommentsScreen
import com.example.eximap_nisarg.composables.FeedScreen
import com.example.eximap_nisarg.composables.SplashScreen
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel


@OptIn(ExperimentalPagingApi::class)
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    feedScreenViewModel: FeedScreenViewModel,
){
    NavHost(navController = navController, startDestination = RouteClass.Lottie.route){

        composable(
            route = RouteClass.Lottie.route,
            enterTransition = {
                when (initialState.destination.route) {
                    RouteClass.Feed.route ->
                        slideInHorizontally(
                            initialOffsetX = { 300 },
                            animationSpec = tween(300)
                        ) + fadeIn(animationSpec = tween(300))
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    RouteClass.Feed.route ->
                        slideOutHorizontally(
                            targetOffsetX = { -300 },
                            animationSpec = tween(100)
                        ) + fadeOut(animationSpec = tween(100))
                    else -> null
                }
            },
            popExitTransition = {
                when (targetState.destination.route) {
                    RouteClass.Feed.route ->
                        slideOutHorizontally(
                            targetOffsetX = { 300 },
                            animationSpec = tween(100)
                        ) + fadeOut(animationSpec = tween(100))
                    else -> null
                }
            }
        ){
            SplashScreen(navController)
        }

        composable(
            route = RouteClass.Feed.route,
            enterTransition = {
                when (initialState.destination.route) {
                    RouteClass.CommentsScreen.route ->
                        slideInHorizontally(
                            initialOffsetX = { 300 },
                            animationSpec = tween(300)
                        ) + fadeIn(animationSpec = tween(300))
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    RouteClass.CommentsScreen.route ->
                        slideOutHorizontally(
                            targetOffsetX = { -300 },
                            animationSpec = tween(300)
                        ) + fadeOut(animationSpec = tween(300))
                    else -> null
                }
            },
            popEnterTransition = {
                when (initialState.destination.route) {
                    RouteClass.CommentsScreen.route ->
                        slideInHorizontally(
                            initialOffsetX = { -300 },
                            animationSpec = tween(300)
                        ) + fadeIn(animationSpec = tween(300))
                    else -> null
                }
            }
        ) {
            FeedScreen(feedScreenViewModel, navController)
        }

        composable(
            route = RouteClass.CommentsScreen.route,
            enterTransition = {
                when (initialState.destination.route) {
                    RouteClass.Feed.route ->
                        slideInHorizontally(
                            initialOffsetX = { 300 },
                            animationSpec = tween(300)
                        ) + fadeIn(animationSpec = tween(300))
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    RouteClass.Feed.route ->
                        slideOutHorizontally(
                            targetOffsetX = { -300 },
                            animationSpec = tween(100)
                        ) + fadeOut(animationSpec = tween(100))
                    else -> null
                }
            },
            popExitTransition = {
                when (targetState.destination.route) {
                    RouteClass.Feed.route ->
                        slideOutHorizontally(
                            targetOffsetX = { 300 },
                            animationSpec = tween(100)
                        ) + fadeOut(animationSpec = tween(100))
                    else -> null
                }
            }
        ){
            CommentsScreen(navController, feedScreenViewModel)
        }
    }
}