package com.example.retrofittestproject

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.retrofittestproject.databinding.AdapterDivisionBinding
import com.example.retrofittestproject.model.DivisionResponseItem

class DivisionAdapter(
    private val divisionList: List<DivisionResponseItem>,
) : RecyclerView.Adapter<DivisionAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterDivisionBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterDivisionBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val division = divisionList[position]
        holder.binding.tvDivisionName.text = division.name
    }

    override fun getItemCount(): Int {
        return divisionList.size
    }


}