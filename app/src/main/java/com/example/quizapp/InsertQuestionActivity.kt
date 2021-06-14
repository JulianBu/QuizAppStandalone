package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.model.Question
import com.example.quizapp.repository.Repository

class InsertQuestionActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var questionValues: ArrayList<AppCompatEditText>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_question)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Insert Question"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        supportActionBar?.elevation = 0.0f

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

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

            if (question.isEmpty()) Toast.makeText(this, "Please enter a question", Toast.LENGTH_SHORT).show()
            if (answer.isEmpty()) Toast.makeText(this, "Please enter an answer", Toast.LENGTH_SHORT).show()
            if (wrongAnswer1.isEmpty()) Toast.makeText(this, "Please enter a wrong Answer 1", Toast.LENGTH_SHORT).show()
            if (wrongAnswer2.isEmpty()) Toast.makeText(this, "Please enter a wrong Answer 2", Toast.LENGTH_SHORT).show()
            if (wrongAnswer3.isEmpty()) Toast.makeText(this, "Please enter a wrong Answer 3", Toast.LENGTH_SHORT).show()
            if (questionSevertiy.isEmpty()) Toast.makeText(this, "Please enter a severtiy", Toast.LENGTH_SHORT).show()

            if (question.isNotEmpty()
                && answer.isNotEmpty()
                && wrongAnswer1.isNotEmpty()
                && wrongAnswer2.isNotEmpty()
                && wrongAnswer3.isNotEmpty()
                && questionSevertiy.isNotEmpty()) {
                val newQuestion = Question(null, question, answer, wrongAnswer1, wrongAnswer2, wrongAnswer3, questionSevertiy.toInt())
                // send request to insert question
                viewModel.postInsertQuestion(newQuestion)
                viewModel.insertQuestionResponse.observe(this, { response ->
                    if (response.isSuccessful) {
                        Toast.makeText(this, "Your Question has been saved.", Toast.LENGTH_SHORT).show()
                        clearList()
                    } else {
                        Toast.makeText(this, "Something went wrong. ${response.errorBody().toString()}", Toast.LENGTH_SHORT).show()
                    }
                })
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