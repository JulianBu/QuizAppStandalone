package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.example.quizapp.model.Question
import com.example.quizapp.util.Constants
import kotlin.random.Random

class InsertQuestionActivity : AppCompatActivity() {

    private lateinit var questionValues: ArrayList<AppCompatEditText>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_insert_question)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Insert Question"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        supportActionBar?.elevation = 0.0f

        val questionInputfield = findViewById<AppCompatEditText>(R.id.et_question)
        val answerInputfield = findViewById<AppCompatEditText>(R.id.et_question_answer)
        val wrongAnswer1Inputfield = findViewById<AppCompatEditText>(R.id.et_question_wronganswer1)
        val wrongAnswer2Inputfield = findViewById<AppCompatEditText>(R.id.et_question_wronganswer2)
        val wrongAnswer3Inputfield = findViewById<AppCompatEditText>(R.id.et_question_wronganswer3)
        val questionSevertiyInputfield = findViewById<AppCompatEditText>(R.id.et_question_severtiy)
        questionValues = ArrayList<AppCompatEditText>()
        questionValues.addAll(arrayListOf(questionInputfield, answerInputfield, wrongAnswer1Inputfield, wrongAnswer2Inputfield, wrongAnswer3Inputfield, questionSevertiyInputfield))

        val sendButton = findViewById<Button>(R.id.btn_insert_question)

        sendButton.setOnClickListener {
            val question = questionInputfield.text.toString()
            val answer = answerInputfield.text.toString()
            val wrongAnswer1 = wrongAnswer1Inputfield.text.toString()
            val wrongAnswer2 = wrongAnswer2Inputfield.text.toString()
            val wrongAnswer3 = wrongAnswer3Inputfield.text.toString()
            val questionSevertiy = questionSevertiyInputfield.text.toString()

            when {
                question.isEmpty() -> Toast.makeText(this, "Please enter a question", Toast.LENGTH_SHORT).show()
                answer.isEmpty() -> Toast.makeText(this, "Please enter an answer", Toast.LENGTH_SHORT).show()
                wrongAnswer1.isEmpty() -> Toast.makeText(this, "Please enter a wrong Answer 1", Toast.LENGTH_SHORT).show()
                wrongAnswer2.isEmpty() -> Toast.makeText(this, "Please enter a wrong Answer 2", Toast.LENGTH_SHORT).show()
                wrongAnswer3.isEmpty() -> Toast.makeText(this, "Please enter a wrong Answer 3", Toast.LENGTH_SHORT).show()
                questionSevertiy.isEmpty() -> Toast.makeText(this, "Please enter a severtiy", Toast.LENGTH_SHORT).show()
            }

            if (question.isNotEmpty()
                && answer.isNotEmpty()
                && wrongAnswer1.isNotEmpty()
                && wrongAnswer2.isNotEmpty()
                && wrongAnswer3.isNotEmpty()
                && questionSevertiy.isNotEmpty()) {
                val newQuestion = Question(Random.nextLong(), question, answer, wrongAnswer1, wrongAnswer2, wrongAnswer3, questionSevertiy.toInt())
                Constants.setQuestion(newQuestion)
                Toast.makeText(this, "Question has been saved", Toast.LENGTH_SHORT).show()
                clearList()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun clearList() {
        for (value in questionValues) {
            value.setText("")
        }
    }
}