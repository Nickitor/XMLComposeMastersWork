package com.example.xmlcomposemasterswork.xml.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xmlcomposemasterswork.databinding.FragmentListsBinding
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel
import com.example.xmlcomposemasterswork.xml.presentation.view.lists.list1.CityListAdapter

class ListsFragment : Fragment() {

    private var _binding: FragmentListsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListsBinding.inflate(inflater, container, false)

        val adapter = CityListAdapter()
        adapter.submitList((1..10).map {
            CityUIModel(
                id = it.toString(),
                url = "https://catherineasquithgallery.com/uploads/posts/2021-02/1613462166_9-p-fon-dlya-prezentatsii-pro-moskvu-10.jpg",
                city = "Москва",
                country = "Россия",
                description = "Описание"
            )
        })
        binding.rvList1.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
