package com.example.retrofittestproject.model

import com.google.gson.annotations.SerializedName

data class DivisionResponseItem(
    @SerializedName("districts")
    val districts: List<District>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)