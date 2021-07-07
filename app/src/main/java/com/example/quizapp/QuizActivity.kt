package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapp.util.Constants
import com.example.quizapp.util.GlobalValues

class QuizActivity : AppCompatActivity() {

    private var rightAnswer: String = ""
    private var curSeverity: Int = 0
    private val answerList: ArrayList<TextView> = ArrayList<TextView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        supportActionBar?.elevation = 0.0f

        setContentView(R.layout.activity_quiz)
        Constants.initQuestions()

        val question = findViewById<TextView>(R.id.tv_question)
        val answer1 = findViewById<TextView>(R.id.btn_answer_a)
        val answer2 = findViewById<TextView>(R.id.btn_answer_b)
        val answer3 = findViewById<TextView>(R.id.btn_answer_c)
        val answer4 = findViewById<TextView>(R.id.btn_answer_d)
        answerList.add(answer1)
        answerList.add(answer2)
        answerList.add(answer3)
        answerList.add(answer4)

        refresh(question)

        // Buttons abhören
        answer1.setOnClickListener {
            if (answer1.text.equals(rightAnswer)) {
                disableButtons()
                answer1.background = ContextCompat.getDrawable(this, R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer1.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            } else {
                disableButtons()
                answer1.background = ContextCompat.getDrawable(this, R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer1.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            }
        }

        answer2.setOnClickListener {
            if (answer2.text.equals(rightAnswer)) {
                disableButtons()
                answer2.background = ContextCompat.getDrawable(this, R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer2.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            } else {
                disableButtons()
                answer2.background = ContextCompat.getDrawable(this, R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer2.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            }
        }

        answer3.setOnClickListener {
            if (answer3.text.equals(rightAnswer)) {
                disableButtons()
                answer3.background = ContextCompat.getDrawable(this, R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer3.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            } else {
                disableButtons()
                answer3.background = ContextCompat.getDrawable(this, R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer3.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            }
        }

        answer4.setOnClickListener {
            if (answer4.text.equals(rightAnswer)) {
                disableButtons()
                answer4.background = ContextCompat.getDrawable(this, R.drawable.button_right_answer)
                updateUserScore(curSeverity)
                Toast.makeText(this, "Your Answer is right!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer4.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            } else {
                disableButtons()
                answer4.background = ContextCompat.getDrawable(this, R.drawable.button_wrong_answer)
                Toast.makeText(this, "Your Answer is wrong!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    refresh(question)
                    answer4.background = ContextCompat.getDrawable(this, R.drawable.button_action)
                    enableButtons()
                }, 3000)
            }
        }
    }

    private fun updateUserScore(severity: Int) {
        GlobalValues.currentScore = GlobalValues.currentScore?.plus((severity * 10))
    }

    private fun disableButtons() {
        for (item in answerList) {
            item.isEnabled = false
        }
    }

    private fun enableButtons() {
        for (item in answerList) {
            item.isEnabled = true
        }
    }

    private fun refresh(newQuestion: TextView) {
        val question = Constants.getQuestion()
        val randomNumbers = (0..3).shuffled()
        newQuestion.setText(question.question)
        curSeverity = question.severity
        rightAnswer = question.answer
        answerList[randomNumbers[0]].setText(question.answer)
        answerList[randomNumbers[1]].setText(question.wrongAnswer_1)
        answerList[randomNumbers[2]].setText(question.wrongAnswer_2)
        answerList[randomNumbers[3]].setText(question.wrongAnswer_3)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        Constants.clearList()
        return super.onSupportNavigateUp()
    }
}