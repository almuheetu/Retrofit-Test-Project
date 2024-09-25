package com.example.retrofittestproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.retrofittestproject.databinding.FragmentThanaListBinding
import com.example.retrofittestproject.reposatories.DivisionRepository
import com.example.retrofittestproject.viewModel.DivisionViewModel


class ThanaFragment : Fragment() {
    private lateinit var binding: FragmentThanaListBinding
    private lateinit var thanaAdapter: ThanaAdapter
    private lateinit var viewModel: DivisionViewModel
    private val args: ThanaFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThanaListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val allDistrict = args.data
        val districtId = allDistrict.id

        val recyclerView: RecyclerView = binding.thanaRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {
                Log.d("Log404", "Division Response : ${it.toString()}")
                val allThana = it
                val filteredThana = allThana.filter { it.id == districtId }
                thanaAdapter = ThanaAdapter(filteredThana[0].districts[0].thanas)
                recyclerView.adapter = thanaAdapter
            }
        }

    }

}