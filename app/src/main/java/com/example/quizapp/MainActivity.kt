package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.example.quizapp.util.GlobalValues

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val registerButton = findViewById<Button>(R.id.btn_register)

        registerButton.setOnClickListener {
        val username = findViewById<AppCompatEditText>(R.id.et_username).text.toString()

            if (username.isEmpty()) Toast.makeText(this, "Enter your username", Toast.LENGTH_SHORT).show()

            if (username.isNotEmpty()) {
                GlobalValues.loggedInUser = username
                GlobalValues.currentScore = 0
                Toast.makeText(this, "You logged in!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}