package com.example.quizapp.util

import android.app.Application

class GlobalValues: Application() {
    companion object {
        var loggedInUser: String = ""
        var currentScore: Int? = 0
    }

    override fun onCreate() {
        super.onCreate()
    }
}