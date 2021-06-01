package com.example.quizapp.model

class Question(
    val questionId: Long?,
    val question: String,
    val answer: String,
    val wrongAnswer_1: String,
    val wrongAnswer_2: String,
    val wrongAnswer_3: String,
    val severity: Int,
)