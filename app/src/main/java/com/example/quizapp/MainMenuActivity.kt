package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.quizapp.util.GlobalValues

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("")

        val gotoQuiz = findViewById<CardView>(R.id.cv_goto_quiz)
        val gotoUserscore = findViewById<CardView>(R.id.cv_goto_userscore)
        val gotoInsertQuestion = findViewById<CardView>(R.id.cv_insert_question)
        findViewById<TextView>(R.id.tv_mm_username).setText(getString(R.string.welcome_user, GlobalValues.loggedInUser))

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

        fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return super.onSupportNavigateUp()
        }
    }
}