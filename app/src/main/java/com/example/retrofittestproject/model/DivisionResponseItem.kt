package com.example.retrofittestproject.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DivisionResponseItem(
    @SerializedName("districts")
    val districts: List<District>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
): Serializable