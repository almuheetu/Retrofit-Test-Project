package com.example.retrofittestproject

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

import com.example.retrofittestproject.databinding.AdapterThanaBinding
import com.example.retrofittestproject.model.Thana


class ThanaAdapter(
    private val thanaList: List<Thana>,
) : RecyclerView.Adapter<ThanaAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterThanaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterThanaBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val thana = thanaList[position]
        viewHolder.binding.tvThanaName.text = thana.name


    }

    override fun getItemCount(): Int {
        return thanaList.size

    }

}