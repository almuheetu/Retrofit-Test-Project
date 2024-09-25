package com.example.retrofittestproject

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.retrofittestproject.placeholder.PlaceholderContent.PlaceholderItem
import com.example.retrofittestproject.databinding.AdapterThanaBinding


class ThanaAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<ThanaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]

    }

    override fun getItemCount(): Int


}