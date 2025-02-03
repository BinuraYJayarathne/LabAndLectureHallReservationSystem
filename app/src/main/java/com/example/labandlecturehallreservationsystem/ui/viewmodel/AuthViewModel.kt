package com.example.labandlecturehallreservationsystem.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.labandlecturehallreservationsystem.data.repository.AuthRepository
import com.example.labandlecturehallreservationsystem.data.storage.UserPreferences
import kotlinx.coroutines.launch

class AuthViewModel(context: Context) : ViewModel() {
    private val repository = AuthRepository()
    private val userPreferences = UserPreferences(context)

    fun login(username: String, password: String, onResult: (Boolean) -> Unit) {
        viewModelScope.launch {
            val response = repository.login(username, password)
            if (response.isSuccessful && response.body() != null) {
                val token = response.body()!!.token
                userPreferences.saveAuthToken(token)
                onResult(true)
            } else {
                onResult(false)
            }
        }
    }
}