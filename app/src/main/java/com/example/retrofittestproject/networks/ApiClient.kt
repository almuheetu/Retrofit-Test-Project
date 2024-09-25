package com.example.retrofittestproject.networks

import com.example.retrofittestproject.model.DivisionResponse

interface ApiInterface {
    @GET("division.json")
    suspend fun getDivision():Response<DivisionResponse>

}