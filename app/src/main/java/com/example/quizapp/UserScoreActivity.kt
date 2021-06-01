package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.quizapp.util.GlobalValues

class UserScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_score)

        val user = findViewById<TextView>(R.id.tv_username_userscore)
        val score = findViewById<TextView>(R.id.tv_current_userscore)
        val userInfo = GlobalValues.loggedInUser + " your current score is"

        user.setText(userInfo)
        score.setText(GlobalValues.currentScore.toString())

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}