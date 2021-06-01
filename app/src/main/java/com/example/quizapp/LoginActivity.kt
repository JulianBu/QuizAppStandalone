package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.model.User
import com.example.quizapp.repository.Repository
import com.example.quizapp.util.GlobalValues

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        val loginButton = findViewById<Button>(R.id.btn_login)
        val gotoRegister = findViewById<TextView>(R.id.tv_switch_to_register)

        loginButton.setOnClickListener {
            val username = findViewById<AppCompatEditText>(R.id.et_username_login).text.toString()
            val password = findViewById<AppCompatEditText>(R.id.et_password_login).text.toString()

            if (username.isEmpty()) Toast.makeText(this, "Enter you Username", Toast.LENGTH_SHORT).show()

            if (password.isEmpty()) Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                viewModel.postLoginUser(User(userId = null, username = username, password = password, score = null))
                viewModel.loginResponse.observe(this, { response ->
                    if (response.isSuccessful) {
                        GlobalValues.loggedInUser = response.body()?.username!!
                        GlobalValues.currentScore = response.body()?.score!!
                        Toast.makeText(this, "${response.body()?.username!!} logged in", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainMenuActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Something went wrong. ${response.errorBody().toString()}", Toast.LENGTH_SHORT).show()
                    }
                })
            } else {
                Toast.makeText(this, "Please type in username and password", Toast.LENGTH_SHORT).show()
            }
        }

        gotoRegister.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}