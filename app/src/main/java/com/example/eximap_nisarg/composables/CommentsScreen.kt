package com.example.eximap_nisarg.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.R
import com.example.eximap_nisarg.ui.theme.divider
import com.example.eximap_nisarg.ui.theme.grey
import com.example.eximap_nisarg.ui.theme.highlightBlue
import com.example.eximap_nisarg.ui.theme.poppins
import com.example.eximap_nisarg.ui.theme.white
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel

@Composable
fun ScreenHeadingWithBackIcon(navController: NavHostController)
{
    Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 10.dp, top = 14.dp)) {
        Icon(painter = painterResource(id = R.drawable.ico_back),
            tint = grey,
            modifier = Modifier
                .align(CenterVertically)
                .padding(end = 14.dp, bottom = 1.dp)
                .height(18.dp)
                .clickable {
                    navController.popBackStack()
                },
            contentDescription = null)

        Text(text = "Comments",
            fontFamily = poppins,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            color = grey
        )
    }
}

@OptIn(ExperimentalPagingApi::class)
@Composable
fun CommentsScreen(navController: NavHostController, viewModel: FeedScreenViewModel){

    val randomComments = (0..8).random()

    val currentPostDetails by viewModel.commentPostState.collectAsState()

    Column(modifier = Modifier.background(white)) {
        ScreenHeadingWithBackIcon(navController)
        Spacer(modifier = Modifier.padding(top = 16.dp))

        currentPostDetails?.let {currentPostDetails ->
            UserBanner(currentPostDetails)

            PostText(currentPostDetails.postTitle)

            LazyColumn{
                item {
                    MediaContent(size = currentPostDetails.mediaList.size, mediaUrl = currentPostDetails.mediaList )
                    CommentsInfo(randomComments)
                }

                items(randomComments){
                    IndividualComments(it)
                    Divider(color = divider, thickness = 2.dp)
                }

            }
        }

    }
}




@Composable
fun CommentsInfo(size: Int){
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 10.dp))
    {
        Text(text = "$size comments",
            fontFamily = poppins,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            color = grey
        )

        Row(horizontalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.ico_recents),
                tint = highlightBlue,
                modifier = Modifier
                    .align(CenterVertically)
                    .padding(end = 2.dp, bottom = 1.dp)
                    .height(13.dp),
                contentDescription = null)

            Text(text = "Recent",
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
                color = highlightBlue
            )
        }
    }
}


@Composable
fun IndividualCommentsBanner()
{
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 10.dp)
    )
    {
        Row(modifier = Modifier
            .fillMaxHeight(),
            horizontalArrangement = Arrangement.Start,
        )
        {
            Image(painter = painterResource(id = R.drawable.profile_placeholder),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .width(50.dp)
                    .height(90.dp)
                    .aspectRatio(
                        1f, matchHeightConstraintsFirst = true
                    )
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Column(verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp))
            {
                Text(text = "User", //Setting the Username
                    style = TextStyle(fontSize = 16.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold),
                )

                Text(text = "Public",
                    color = grey,
                    fontFamily = poppins,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium)
            }
        }

        Icon(painter = painterResource(id = R.drawable.ico_options_vertical),
            modifier = Modifier.align(CenterVertically),
            tint = grey,
            contentDescription = "Options")
    }
}

@Composable
fun LikeCommentSection()
{
    var clicked by remember { mutableStateOf(false) }
    Row(modifier = Modifier
        .padding(bottom = 8.dp, start = 10.dp)
        .clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
        ) {
            clicked = !clicked
        }) {
        Row(horizontalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(
                id = if(clicked){
                    R.drawable.ico_favourite_selected
                }else{
                    R.drawable.ico_favourite_deselected
                }),
                tint = if(clicked){
                    highlightBlue
                }else{
                    grey
                },
                modifier = Modifier
                    .align(CenterVertically)
                    .padding(end = 6.dp, bottom = 3.dp)
                    .height(13.dp),
                contentDescription = null)

            Text(text = "Like",
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
                color = if(!clicked){
                    grey
                }else{
                    highlightBlue
                }
            )
        }
    }
}

@Composable
fun IndividualComments(index: Int)
{
    Column(modifier = Modifier
        .padding(start = 10.dp, top = 14.dp, end = 10.dp)
        .background(white)) {
        IndividualCommentsBanner()
        Text(text = "This is a comment $index from user $index, and is a dummy comment showed since there are very less comments available",
            fontFamily = poppins,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 10.dp, top = 6.dp, bottom = 2.dp))
        LikeCommentSection()
    }
}
