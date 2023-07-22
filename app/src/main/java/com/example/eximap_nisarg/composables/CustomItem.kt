package com.example.eximap_nisarg.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import com.example.eximap_nisarg.R
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.navigation.RouteClass
import com.example.eximap_nisarg.ui.theme.divider
import com.example.eximap_nisarg.ui.theme.grey
import com.example.eximap_nisarg.ui.theme.highlightBlue
import com.example.eximap_nisarg.ui.theme.poppins
import com.example.eximap_nisarg.ui.theme.white
import com.example.eximap_nisarg.viewmodel.feed_view_model.FeedScreenViewModel


@OptIn(ExperimentalPagingApi::class)
@Composable
fun CustomItem(
    post: PostDetails,
    navController: NavHostController,
    viewModel: FeedScreenViewModel
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(white)) {

        Spacer(modifier = Modifier.padding(top = 16.dp))
        UserBanner(user = post)

        PostText(post.postTitle)

        MediaContent(size = post.mediaList.size, mediaUrl = post.mediaList)

        Spacer(modifier = Modifier.padding(top = 10.dp))
        PostInteraction(post = post, navController,viewModel)
        Spacer(modifier = Modifier.padding(top = 14.dp))
        Divider(color = divider, thickness = 2.dp)
    }
}


@OptIn(ExperimentalPagingApi::class)
@Composable
fun PostInteraction(
    post: PostDetails,
    navController: NavHostController,
    viewModel: FeedScreenViewModel
){

    var clickedLike by remember {mutableStateOf(false)}

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(20.dp)
        .padding(horizontal = 12.dp))
    {
        Row(modifier = Modifier
            .fillMaxHeight()
            .weight(1f)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                clickedLike = !clickedLike
            },
            horizontalArrangement = Arrangement.Start
        )
        {
            Icon(painter = painterResource(id = if (clickedLike){
                R.drawable.ico_favourite_selected
            }else{
                R.drawable.ico_favourite_deselected
            }),
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                tint = if(clickedLike){
                    highlightBlue
                }else{
                    grey
                },
                contentDescription = "Like")

            Text(text = "${post.numLikes} likes",
                fontFamily = poppins,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 6.dp))
        }

        Row(modifier = Modifier
            .fillMaxHeight()
            .weight(1f)
            .clickable {
                viewModel.updateCommentPostState(post)
                navController.navigate(RouteClass.CommentsScreen.route)
            },
            horizontalArrangement = Arrangement.Center
        )
        {
            Icon(painter = painterResource(id = R.drawable.ico_comment),
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(top = 2.dp, bottom = 1.dp),
                tint = grey,
                contentDescription = "Comments")

            Text(text = "${post.numReplies} comments",
                fontFamily = poppins,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 6.dp))
        }

        Row(modifier = Modifier
            .fillMaxHeight()
            .weight(1f),
            horizontalArrangement = Arrangement.End
        )
        {
            Icon(painter = painterResource(id = R.drawable.ico_share),
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                tint = grey,
                contentDescription = "Share")

            Text(text = "share",
                fontFamily = poppins,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 3.dp))
        }
    }
}

