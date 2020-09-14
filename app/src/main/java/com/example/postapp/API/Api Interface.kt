package com.example.postapp.API

import com.example.postapp.model.post
import ke.co.postsapp.api
import retrofit2.Response
import retrofit2.http.GET


class ApiInterface {
    @GET("posts")
    suspend fun getPosts(): Reponse<List<post>> {
    }
}