package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.quizapp.util.GlobalValues

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        supportActionBar?.title = ""
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
        supportActionBar?.elevation = 0.0f

        setContentView(R.layout.activity_main_menu)

        val gotoQuiz = findViewById<CardView>(R.id.cv_goto_quiz)
        val gotoUserscore = findViewById<CardView>(R.id.cv_goto_userscore)
        val gotoInsertQuestion = findViewById<CardView>(R.id.cv_insert_question)
        findViewById<TextView>(R.id.tv_mm_username).text =
            getString(R.string.welcome_user, GlobalValues.loggedInUser)

        gotoQuiz.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        gotoUserscore.setOnClickListener {
            val intent = Intent(this, UserScoreActivity::class.java)
            startActivity(intent)
        }

        gotoInsertQuestion.setOnClickListener {
            val intent = Intent(this, InsertQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}