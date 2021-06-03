package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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

        val pic1 = R.drawable.cliofront
        val pic2 = R.drawable.fahrwerk
        val pic3 = R.drawable.mx5
        val pic4 = R.drawable.m240i
        val pictureList: ArrayList<Int> = ArrayList<Int>(4)
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

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}