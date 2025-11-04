package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.repository.PostRepository

class PostViewModel : ViewModel(){
    private val repository = PostRepository()

    
}