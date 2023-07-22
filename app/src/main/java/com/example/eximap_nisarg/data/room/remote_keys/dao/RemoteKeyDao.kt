package com.example.eximap_nisarg.data.room.remote_keys.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.eximap_nisarg.data.room.remote_keys.entities.PostRemoteKeys
import com.example.eximap_nisarg.util.Constants.Companion.REMOTE_KEY_TABLE_NAME

@Dao
interface RemoteKeyDao {

    @Query("SELECT * FROM remote_key WHERE postId = :postId")
    suspend fun getRemoteKeys(postId: String): PostRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<PostRemoteKeys>)

    @Query ("DELETE FROM $REMOTE_KEY_TABLE_NAME")
    suspend fun deleteAllRemoteKeys()

}