package com.example.eximap_nisarg.data.room.remote_keys.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.eximap_nisarg.util.Constants.Companion.REMOTE_KEY_TABLE_NAME

@Entity (tableName = REMOTE_KEY_TABLE_NAME)
data class PostRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val postId: String,
    val prevPage: Int?,
    val nextPage: Int?
)