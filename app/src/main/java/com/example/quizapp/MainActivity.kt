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

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        val registerButton = findViewById<Button>(R.id.btn_register)
        val gotoLogin = findViewById<TextView>(R.id.tv_switch_to_login)

        registerButton.setOnClickListener {
        val username = findViewById<AppCompatEditText>(R.id.et_username).text.toString()
        val password = findViewById<AppCompatEditText>(R.id.et_password).text.toString()

            if (username.isEmpty()) Toast.makeText(this, "Enter your username", Toast.LENGTH_SHORT).show()

            if (password.isEmpty()) Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                //sendet Request
                viewModel.postRegisterUser(User(userId = 0, username = username, password = password, score = 0))
                viewModel.registerResponse.observe(this, { response ->
                    if (response.isSuccessful) {
                        GlobalValues.loggedInUser = response.body()?.username!!
                        GlobalValues.currentScore = response.body()?.score
                        Toast.makeText(this, "User: ${response.body()?.username!!} created", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainMenuActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Something went wrong. ${response.errorBody().toString()}", Toast.LENGTH_SHORT).show()
                    }
                })
            }
        }

        gotoLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}