package com.example.postapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.postapp.model.post
import ke.co.postsapp.models.Post
import ke.co.postsapp.repository.PostsRespository
import kotlinx.coroutines.launch

class PostsViewmodel(val postsRespository: PostsRepository): ViewModel () {
var postsLiveData = MutableLiveData<List<Post>>()
    
    fun getPosts(){
        viewModelScope.launch { this:CoroutineScope
        val reponse = postsRespository.getPosts()
        if (response.isSuccessful){
            postsLiveData.postValue(response.body())
        }
        }
    }
}