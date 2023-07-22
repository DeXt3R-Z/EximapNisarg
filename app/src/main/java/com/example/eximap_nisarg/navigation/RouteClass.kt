package com.example.eximap_nisarg.navigation

sealed class RouteClass(var route: String){
    object Lottie: RouteClass(route = "lottie")
    object Feed: RouteClass(route = "feed_screen")
    object CommentsScreen: RouteClass(route = "comments_screen")
}
