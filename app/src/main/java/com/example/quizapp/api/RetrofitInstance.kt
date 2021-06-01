package com.example.quizapp.api

import com.example.quizapp.util.Constants.Companion.BASE_URL2
import com.example.quizapp.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: BackendApi by lazy {
        retrofit.create(BackendApi::class.java)
    }
}