package com.example.xmlcomposemasterswork.xml.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xmlcomposemasterswork.databinding.FragmentMainBinding
import com.example.xmlcomposemasterswork.xml.presentation.model.ScreenCardUiModel
import com.example.xmlcomposemasterswork.xml.presentation.view.screencard.ScreenCardAdapter

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        val adapter = ScreenCardAdapter()
        adapter.submitList((1..10).map {
            ScreenCardUiModel(
                id = it,
                title = "Эксперимент № $it",
                description = "Описание"
            )
        })
        adapter.onClickListener = {

        }
        binding.rvScreens.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
