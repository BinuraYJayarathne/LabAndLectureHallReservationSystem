package com.example.labandlecturehallreservationsystem.data.api

import com.example.labandlecturehallreservationsystem.data.model.LoginRequest
import com.example.labandlecturehallreservationsystem.data.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("api/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>
}