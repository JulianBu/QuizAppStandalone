package com.example.quizapp.api

import com.example.quizapp.model.Question
import com.example.quizapp.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

//Definiere die retrofit Requests als Interface
interface BackendApi {

    @POST("/quizapp/login")
    suspend fun postLoginUser(@Body userData: User): Response<User>

    @POST("/quizapp/register")
    suspend fun postRegisterUser(@Body userData: User): Response<User>

    @POST("/quizapp/insertQuestion")
    suspend fun postInsertQuestion(@Body questionData: Question): Response<Question>

    @POST("/quizapp/update-score")
    suspend fun postUpdateScore(@Body userData: User): Response<User>

    @GET("/quizapp/get-question")
    suspend fun getQuestion(): Response<Question>
}