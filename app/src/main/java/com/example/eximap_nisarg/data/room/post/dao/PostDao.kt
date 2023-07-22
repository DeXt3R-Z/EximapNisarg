package com.example.eximap_nisarg.data.room.post.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.util.Constants.Companion.TABLE_NAME

@Dao
interface PostDao {

    @Query("SELECT * from $TABLE_NAME")
    fun getItems(): PagingSource<Int, PostDetails>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPost(post: List<PostDetails>)

    @Query("DELETE FROM $TABLE_NAME")
    suspend fun deleteItems()

}