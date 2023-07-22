package com.example.eximap_nisarg.composables

import android.net.Uri
import androidx.media3.common.MediaItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.eximap_nisarg.R
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.ui.theme.grey
import com.example.eximap_nisarg.ui.theme.highlightBlue
import com.example.eximap_nisarg.ui.theme.lightBlue
import com.example.eximap_nisarg.ui.theme.poppins
import com.kotlang.social.MediaUrl
import com.kotlang.social.UserPostProto
import java.text.SimpleDateFormat
import java.util.Date


fun getTimeDifference(time: Long): String{
//    val timeDiff = System.currentTimeMillis() - time
    val date = Date(time)
    val format = SimpleDateFormat("yyyy.MM.dd HH:mm")
    return format.format(date)

}

@Composable
fun UserBanner(user: PostDetails) //Used in both Feed and Comments Screen. Displays the name and other details of the user posting the post
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
            if(user.postAuthorImage == ""){
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
            }else{
                AsyncImage(model = user.postAuthorImage,
                    placeholder = painterResource(id = R.drawable.profile_placeholder),
                    modifier = Modifier
                        .width(50.dp)
                        .height(90.dp)
                        .aspectRatio(
                            1f, matchHeightConstraintsFirst = true
                        )
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    contentDescription = null)
            }


            Column(verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp))
            {
                Row() {
                    Text(text = user.postAuthorName, //Setting the Username
                        style = TextStyle(fontSize = 18.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.SemiBold),
                        modifier = Modifier.padding(end = 4.dp)
                    )

                    if(user.tags != ""){
                        Box(modifier = Modifier
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = lightBlue)
                            .padding(horizontal = 8.dp, vertical = 4.dp))
                        {
                            Text(text = user.tags,
                                fontSize = 12.sp,
                                color = highlightBlue,
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }

                Text(text = getTimeDifference(user.createdOn),
                    color = grey,
                    fontFamily = poppins,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium)
            }


        }

        Icon(painter = painterResource(id = R.drawable.ico_options),
            modifier = Modifier
                .align(Alignment.CenterVertically),
            tint = grey,
            contentDescription = "Options")
    }
}



@Composable
fun PostText(text: String){
    Text(text =  text,
        fontFamily = poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        modifier = Modifier.padding(start = 10.dp,top = 12.dp, bottom = 4.dp))
}

@Composable
fun MediaContent(size: Int, mediaUrl: MutableList<MediaUrl>){
    if (size == 1 && mediaUrl[0].mimeType == "image/jpeg" ){
        AsyncImage(model = mediaUrl[0].url.toString(),
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
            contentDescription = null)
    }
    else if(size>0 && mediaUrl[0].mimeType == "video/mp4")
    {
        ExoVideoPlayer(url = mediaUrl[0].url)
    }
    else{
        PostMedia(mediaUrlsList = mediaUrl)
    }
}


@Composable
fun ExoVideoPlayer(url: String){

    val context = LocalContext.current

    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            repeatMode = Player.REPEAT_MODE_ALL
        }
    }

    val lifecycleOwner by rememberUpdatedState(newValue = LocalLifecycleOwner.current)

    DisposableEffect(lifecycleOwner){

        exoPlayer.prepare()
        exoPlayer.playWhenReady= true
        exoPlayer.setMediaItem(MediaItem.fromUri(Uri.parse(url)))

        val lifecycle = lifecycleOwner.lifecycle

        val observer = LifecycleEventObserver { _, event ->
            when(event){
                Lifecycle.Event.ON_PAUSE -> {
                    exoPlayer.playWhenReady = false
                }
                Lifecycle.Event.ON_RESUME -> {
                    exoPlayer.playWhenReady = true
                }
                Lifecycle.Event.ON_DESTROY -> {
                    exoPlayer.run {
                        stop()
                        release()
                    }
                }
                else -> {}
            }
        }

        lifecycle.addObserver(observer)

        onDispose {
            exoPlayer.release()
            lifecycle.removeObserver(observer)
        }
    }

    AndroidView(
        factory = {context ->
            PlayerView(context).also {
                it.player = exoPlayer
            }
        }, modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(16 / 9f))

}


@Composable
fun PostMedia(mediaUrlsList: MutableList<MediaUrl>) {
    LazyRow(modifier = Modifier.padding(3.dp)){
        items(items = mediaUrlsList){

            AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                .data(it.url.toString())
                .build(),
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(start = 3.dp, end = 3.dp, bottom = 4.dp)
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp)),
                contentDescription = null)

        }
    }
}