package com.example.eximap_nisarg.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.eximap_nisarg.data.room.post.dao.PostDao
import com.example.eximap_nisarg.data.room.post.entities.PostDetails
import com.example.eximap_nisarg.data.room.post.type_converter.MediaUrlConverter
import com.example.eximap_nisarg.data.room.remote_keys.dao.RemoteKeyDao
import com.example.eximap_nisarg.data.room.remote_keys.entities.PostRemoteKeys

@Database(entities = [PostDetails::class, PostRemoteKeys::class], version = 1)
@TypeConverters(MediaUrlConverter::class)
abstract class PostDatabase: RoomDatabase() {

    abstract fun postDao(): PostDao
    abstract fun remoteKeysDao(): RemoteKeyDao

    companion object{

        @Volatile
        var DATABASE: PostDatabase? = null

        fun getDatabase(context: Context): PostDatabase
        {
            if (DATABASE==null)
            {
                synchronized(this) {
                    DATABASE = Room.databaseBuilder(context.applicationContext,PostDatabase::class.java,"postDatabase").build()
                }
            }
            return DATABASE!!
        }
    }

}