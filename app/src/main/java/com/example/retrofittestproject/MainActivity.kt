package com.example.retrofittestproject

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.retrofittestproject.databinding.ActivityMainBinding
import com.example.retrofittestproject.reposatories.DivisionRepository
import com.example.retrofittestproject.viewModel.DivisionViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: DivisionViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if (savedInstanceState == null) {
//            val thanaFragment = ThanaFragment()
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.thana_fragment_container, thanaFragment)
//                .commit()
//        }


    }
}