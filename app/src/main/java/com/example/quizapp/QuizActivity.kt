package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.util.GlobalValues

class QuizActivity : AppCompatActivity() {

    private var rightAnswer: String = ""
    private var questionString: String = ""
    private var curSeverity: Int = 0
    private val questionList: ArrayList<Button> = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        supportActionBar?.elevation = 0.0f

        val question = findViewById<TextView>(R.id.tv_question)
        val answer1 = findViewById<Button>(R.id.btn_answer_a)
        val answer2 = findViewById<Button>(R.id.btn_answer_b)
        val answer3 = findViewById<Button>(R.id.btn_answer_c)
        val answer4 = findViewById<Button>(R.id.btn_answer_d)
        questionList.add(answer1)
        questionList.add(answer2)
        questionList.add(answer3)
        questionList.add(answer4)

        // Buttons abhören
        answer1.setOnClickListener {
            if (answer1.text.equals(rightAnswer)) {
                answer1.setBackgroundResource(R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer1.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            } else {
                answer1.setBackgroundResource(R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer1.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            }
        }

        answer2.setOnClickListener {
            if (answer2.text.equals(rightAnswer)) {
                answer2.setBackgroundResource(R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer2.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            } else {
                answer2.setBackgroundResource(R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer2.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            }
        }

        answer3.setOnClickListener {
            if (answer3.text.equals(rightAnswer)) {
                answer3.setBackgroundResource(R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer3.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            } else {
                answer3.setBackgroundResource(R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer3.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            }
        }

        answer4.setOnClickListener {
            if (answer4.text.equals(rightAnswer)) {
                answer4.setBackgroundResource(R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer4.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            } else {
                answer4.setBackgroundResource(R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    answer4.setBackgroundResource(R.drawable.button_action)
                }, 3000)
            }
        }
    }

    private fun updateUserScore(severity: Int) {
        GlobalValues.currentScore = GlobalValues.currentScore?.plus((severity * 10))

    }

    private fun refresh(newQuestion: TextView) {

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}