package com.example.quizapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.model.Question
import com.example.quizapp.model.User
import com.example.quizapp.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val loginResponse: MutableLiveData<Response<User>> = MutableLiveData()
    val registerResponse: MutableLiveData<Response<User>> = MutableLiveData()
    val insertQuestionResponse: MutableLiveData<Response<Question>> = MutableLiveData()
    val getUserScoreResponse: MutableLiveData<Response<User>> = MutableLiveData()
    val getQuestionResponse: MutableLiveData<Response<Question>> = MutableLiveData()

    fun postLoginUser(user: User) {
        viewModelScope.launch {
            val response: Response<User> = repository.postLoginUser(user)
            loginResponse.value = response
        }
    }

    fun postRegisterUser(user: User) {
        viewModelScope.launch {
            val response: Response<User> = repository.postRegisterUser(user)
            registerResponse.value = response
        }
    }

    fun postInsertQuestion(question: Question) {
        viewModelScope.launch {
            val response: Response<Question> = repository.postInstertQuestion(question)
            insertQuestionResponse.value = response
        }
    }

    fun postUpdateScore(user: User) {
        viewModelScope.launch {
            val response: Response<User> = repository.getUpdateScore(user)
            getUserScoreResponse.value = response
        }
    }

    fun getQuestion() {
        viewModelScope.launch {
            val response: Response<Question> = repository.getQuestion()
            getQuestionResponse.value = response
        }
    }
}