package com.example.retrofittestproject.model

data class District(
    val division_id: Int,
    val id: Int,
    val name: String,
    val thanas: List<Thana>
)