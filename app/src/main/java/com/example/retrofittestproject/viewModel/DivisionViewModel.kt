package com.example.retrofittestproject.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofittestproject.model.DivisionResponse
import com.example.retrofittestproject.reposatories.DivisionRepository
import kotlinx.coroutines.launch
import java.io.IOException

class DivisionViewModel(val divisionRepository: DivisionRepository): ViewModel() {
    private val _items: MutableLiveData<DivisionResponse?> by lazy {
        MutableLiveData<DivisionResponse?>()
    }
    val items: LiveData<DivisionResponse?> get() = _items

    fun getDivision() = viewModelScope.launch {
        try {
            _items.value = divisionRepository.getDivisions()

        } catch (e: IOException) {
            Log.d("catch", "getDivision: $e")
            _items.value = null

        }
    }
}