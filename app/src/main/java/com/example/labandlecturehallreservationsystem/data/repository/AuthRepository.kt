package com.example.labandlecturehallreservationsystem.data.repository

import com.example.labandlecturehallreservationsystem.data.api.RetrofitInstance
import com.example.labandlecturehallreservationsystem.data.model.LoginRequest
import com.example.labandlecturehallreservationsystem.data.model.LoginResponse
import retrofit2.Response

class AuthRepository {
    suspend fun login(username: String, password: String): Response<LoginResponse> {
        return RetrofitInstance.api.login(LoginRequest(username, password))
    }
}