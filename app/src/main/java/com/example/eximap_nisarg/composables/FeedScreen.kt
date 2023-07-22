package com.example.eximap_nisarg.composables

import androidx.compose.foundation.background
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.ui.theme.divider
import com.example.eximap_nisarg.ui.theme.highlightBlue
import com.example.eximap_nisarg.ui.theme.poppins
import com.example.eximap_nisarg.ui.theme.white
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey


@ExperimentalPagingApi

lateinit var localFeedScreenViewModel: FeedScreenViewModel

@ExperimentalPagingApi
@Composable
fun FeedScreen(feedScreenViewModel: FeedScreenViewModel, navController: NavHostController) {
    localFeedScreenViewModel = feedScreenViewModel
    Column(modifier = Modifier.background(white)) {
        TabLayout(navController)
    }
}

@ExperimentalPagingApi
@Composable
fun Charcha(navController: NavHostController){
    val pagingData = localFeedScreenViewModel.getFeed.collectAsLazyPagingItems()
    LazyColumn(){
        items(count = pagingData.itemCount,
        key = pagingData.itemKey {it.postId},
        contentType = pagingData.itemContentType{"contentType"}){index ->  
            val item = pagingData[index]
            if (item != null) {
                CustomItem(post = item, navController = navController, viewModel = localFeedScreenViewModel)
            }
        }
    }
}


@Composable
fun Bazaar(){

}

@Composable
fun Profile(){

}

@OptIn(ExperimentalPagingApi::class)
@Composable
fun TabLayout(navController: NavHostController) {

    var state by remember { mutableStateOf(0) }

    val titles = listOf("charcha", "bazaar", "profile")

    TabRow(containerColor = white,
        contentColor = white,
        selectedTabIndex = state,
        divider = { Divider(thickness = 1.dp, color = divider) },
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[state]),
                color = highlightBlue,
                height = 3.dp
            )
        }) {
        titles.forEachIndexed { index, title ->
            Tab(selected = state == index,
                onClick = { state = index },
                text = {
                    Text(text = title,
                        fontFamily = poppins,
                        color = highlightBlue,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            )
        }
    }

    when(state){
        0 -> {Charcha(navController)}
        1 -> {Bazaar()}
        2 -> {Profile()}
    }

}
