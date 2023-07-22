package com.example.eximap_nisarg.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.eximap_nisarg.R
import com.example.eximap_nisarg.navigation.RouteClass
import com.example.eximap_nisarg.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController){
    var startAnimation by remember { mutableStateOf(false) }
    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(4000L)
        navHostController.popBackStack()
        navHostController.navigate(RouteClass.Feed.route)
    }
    ShowLottieAnimation()
}


@Composable
fun ShowLottieAnimation(){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.farmer))
    val animationState by animateLottieCompositionAsState(
        composition = composition,
        isPlaying = true
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = white),
        contentAlignment = Alignment.Center) {
        LottieAnimation(
            composition = composition,
            progress = { animationState },
            modifier = Modifier.size(350.dp)
        )
    }
}