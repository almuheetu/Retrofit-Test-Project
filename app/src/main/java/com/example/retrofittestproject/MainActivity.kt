package com.example.retrofittestproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofittestproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

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