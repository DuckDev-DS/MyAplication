package com.example.myapplication.repository

import com.example.myapplication.data.model.Post
import com.example.myapplication.data.remote.RetrofitInsance

class PostRepository {
    suspend fun getPost(): List<Post>{
        return RetrofitInsance.api.getPost()
    }
}