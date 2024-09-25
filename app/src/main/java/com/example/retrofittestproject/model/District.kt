package com.example.retrofittestproject.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class District(
    @SerializedName("division_id")
    val division_id: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("thanas")
    val thanas: List<Thana>
): Serializable