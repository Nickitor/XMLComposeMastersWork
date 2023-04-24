package com.example.xmlcomposemasterswork.xml.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xmlcomposemasterswork.R.string
import com.example.xmlcomposemasterswork.databinding.FragmentListOfListsBinding

class ListOfListsFragment : Fragment() {

    private var _binding: FragmentListOfListsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListOfListsBinding.inflate(inflater, container, false)

        setupNavigation()

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun setupNavigation() {
        binding.actionBar.apply {
            ivBack.setOnClickListener {
                findNavController().popBackStack()
            }
            tvTitle.text = getString(string.xml_list_of_lists_screen_title)
        }
        binding.actionBar.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}
