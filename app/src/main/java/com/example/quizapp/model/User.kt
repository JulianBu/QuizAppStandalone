package com.example.quizapp.model

data class User(
    val userId: Long?,
    val username: String,
    val password: String,
    val score: Int?
)