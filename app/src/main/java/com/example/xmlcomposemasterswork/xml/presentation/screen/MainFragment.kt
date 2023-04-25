package com.example.xmlcomposemasterswork.xml.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.data.source.ExperimentSource
import com.example.xmlcomposemasterswork.databinding.FragmentMainBinding
import com.example.xmlcomposemasterswork.domain.model.Screen.CustomViewScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.ListOfDifferentItemsScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.ListOfListsScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.MainScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.WithUpdatesScreen
import com.example.xmlcomposemasterswork.xml.presentation.adapter.screencard.ScreenCardAdapter

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val adapter: ScreenCardAdapter = ScreenCardAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
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
        adapter.submitList(ExperimentSource.getExperiments())
        binding.rvScreens.adapter = adapter
    }

    private fun setupNavigation() {
        adapter.onClickListener = { screen ->
            findNavController().navigate(
                when (screen.screenType) {
                    MainScreen -> R.id.action_mainFragment_self
                    ListOfListsScreen -> R.id.action_mainFragment_to_listOfListsFragment
                    ListOfDifferentItemsScreen -> R.id.action_mainFragment_to_listDifferentItemsFragment
                    CustomViewScreen -> R.id.action_mainFragment_to_customViewFragment
                    WithUpdatesScreen -> R.id.action_mainFragment_to_withUpdatesFragment
                }
            )
        }
    }
}
