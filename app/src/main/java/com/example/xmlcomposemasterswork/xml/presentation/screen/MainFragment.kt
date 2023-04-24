package com.example.xmlcomposemasterswork.xml.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xmlcomposemasterswork.databinding.FragmentMainBinding
import com.example.xmlcomposemasterswork.xml.data.source.ExperimentSource
import com.example.xmlcomposemasterswork.xml.presentation.view.screencard.ScreenCardAdapter

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val adapter: ScreenCardAdapter = ScreenCardAdapter()

    private val experimentSource = ExperimentSource()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        setupAdapter()
        setupNavigation()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupAdapter() {
        adapter.submitList(experimentSource.getExperiments())
        binding.rvScreens.adapter = adapter
    }

    private fun setupNavigation() {
        adapter.onClickListener = { screen ->
            when (screen.id) {
                else -> Unit
            }
        }
    }
}
