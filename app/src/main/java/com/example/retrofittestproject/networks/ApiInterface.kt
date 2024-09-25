package com.example.retrofittestproject.networks

import com.example.retrofittestproject.model.DivisionResponse
import retrofit2.Response

import retrofit2.http.GET

interface ApiInterface {
    @GET("division.json")
    suspend fun getDivision(): Response<DivisionResponse>
}