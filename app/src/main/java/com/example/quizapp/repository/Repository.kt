package com.example.quizapp.repository

import com.example.quizapp.api.RetrofitInstance
import com.example.quizapp.model.Question
import com.example.quizapp.model.User
import retrofit2.Response

class Repository {

    suspend fun postLoginUser(user: User): Response<User> {
        return RetrofitInstance.api.postLoginUser(user)
    }

    suspend fun postRegisterUser(user: User): Response<User> {
        return RetrofitInstance.api.postRegisterUser(user)
    }

    suspend fun postInstertQuestion(question: Question): Response<Question> {
        return RetrofitInstance.api.postInsertQuestion(question)
    }

    suspend fun getUpdateScore(user: User): Response<User> {
        return RetrofitInstance.api.postUpdateScore(user)
    }

    suspend fun getQuestion(): Response<Question> {
        return RetrofitInstance.api.getQuestion()
    }
}