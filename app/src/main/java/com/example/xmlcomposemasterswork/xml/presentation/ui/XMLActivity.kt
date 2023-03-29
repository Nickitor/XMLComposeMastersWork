package com.example.xmlcomposemasterswork.xml.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.databinding.ActivityXmlactivityBinding
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel
import com.example.xmlcomposemasterswork.xml.presentation.view.citylist.CityListAdapter

class XMLActivity : AppCompatActivity() {

    var _binding: ActivityXmlactivityBinding? = null
    private val binding: ActivityXmlactivityBinding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityXmlactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CityListAdapter()
        adapter.submitList((1..10).map {
            CityUIModel(
                id = it.toString(),
                url = "",
                city = "Москва",
                country = "Россия",
                description = "Описание"
            )
        })
        binding.rv.adapter = adapter
    }
}
