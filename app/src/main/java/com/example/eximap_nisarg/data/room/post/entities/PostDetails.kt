package com.example.eximap_nisarg.data.room.post.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.eximap_nisarg.util.Constants.Companion.TABLE_NAME
import com.kotlang.social.MediaUrl

@Entity (tableName = TABLE_NAME)
data class PostDetails(
    @PrimaryKey (autoGenerate = false)
    var postId: String,
    var postAuthorImage: String,
    var postAuthorName: String,
    var tags: String,
    var createdOn: Long,
    var postTitle: String,
    var mediaList: MutableList<MediaUrl>,
    var numLikes: Int,
    var numReplies: Int
)