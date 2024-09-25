package com.example.retrofittestproject.reposatories

import com.example.retrofittestproject.model.DivisionResponse
import com.example.retrofittestproject.networks.ApiClient
import com.example.retrofittestproject.networks.ApiInterface

class DivisionRepository(){
    suspend fun getDivisions(): DivisionResponse {
        val divisionApi = ApiClient.getInstance().create(ApiInterface::class.java)
        return divisionApi.getDivision().body()!!
    }
}