package com.example.eximap_nisarg.repository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RepositoryTemp {


    fun getComments(): MutableList<String>
    {
        val commentsList = mutableListOf<String>()
        CoroutineScope(Dispatchers.IO).launch {
            for(i in 0..((0..8).random())){
                commentsList.add("This is a comment $i from user $i, and is a dummy comment showed since there are very less comments available")
            }
        }
        return commentsList
    }

}