package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.util.GlobalValues


class UserScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_score)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#e5e5e2")))

        val pic1 = R.drawable.cliofront
        val pic2 = R.drawable.fahrwerk
        val pic3 = R.drawable.mx5
        val pic4 = R.drawable.m240i
        val pictureList = ArrayList<Int>(4)
        pictureList.add(pic1)
        pictureList.add(pic2)
        pictureList.add(pic3)
        pictureList.add(pic4)

        val image = findViewById<ImageView>(R.id.random_picture_userscore)
        val user = findViewById<TextView>(R.id.tv_username_userscore)
        val score = findViewById<TextView>(R.id.tv_current_userscore)
        val userInfo = GlobalValues.loggedInUser + " your current score is"

        image.setImageResource(pictureList[(0..3).shuffled().first()])
        user.setText(userInfo)
        score.setText(GlobalValues.currentScore.toString())

    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}