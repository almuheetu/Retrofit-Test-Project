package com.example.retrofittestproject

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.retrofittestproject.databinding.AdapterDistrictBinding
import com.example.retrofittestproject.model.District


class DistrictAdapter(
    private val divisionList: List<District>,
) : RecyclerView.Adapter<DistrictAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterDistrictBinding) : RecyclerView.ViewHolder(binding.root)
    companion object{
        var listener: ItemClickListener? = null
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AdapterDistrictBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val division = divisionList[position]
        viewHolder.binding.tvDistrictName.text = division.name
        viewHolder.itemView.setOnClickListener {
            listener?.onItemClick(division)
        }
    }

    override fun getItemCount(): Int {
        return divisionList.size

    }


    interface ItemClickListener {
        fun onItemClick(district: District)
    }

}