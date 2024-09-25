package com.example.retrofittestproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.retrofittestproject.databinding.FragmentDistrictListBinding
import com.example.retrofittestproject.databinding.FragmentDivisionListBinding
import com.example.retrofittestproject.model.District
import com.example.retrofittestproject.placeholder.PlaceholderContent
import com.example.retrofittestproject.reposatories.DivisionRepository
import com.example.retrofittestproject.viewModel.DivisionViewModel

class DistrictFragment : Fragment(), DistrictAdapter.ItemClickListener {
    private lateinit var binding: FragmentDistrictListBinding
    private lateinit var districtAdapter: DistrictAdapter
    private lateinit var viewModel: DivisionViewModel
    private val args: DistrictFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDistrictListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val division = args.data
        val divisionId = division.id

        val recyclerView: RecyclerView = binding.districtRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        DistrictAdapter.listener = this
        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {
                val allDistrict = it
                val districtList = allDistrict.filter { it.id == divisionId }
                districtAdapter = DistrictAdapter(districtList[0].districts)
                recyclerView.adapter = districtAdapter

            }

        }

    }

    override fun onItemClick(district: District) {
        val action = DistrictFragmentDirections.actionDistrictFragmentToThanaFragment(district)
        findNavController().navigate(action)
    }
}