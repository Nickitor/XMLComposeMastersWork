package com.example.xmlcomposemasterswork.xml.presentation.ui

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.xmlcomposemasterswork.compose.presentation.ComposeActivity
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
                url = "https://catherineasquithgallery.com/uploads/posts/2021-02/1613462166_9-p-fon-dlya-prezentatsii-pro-moskvu-10.jpg",
                city = "Москва",
                country = "Россия",
                description = "Описание"
            )
        })
        binding.rv.adapter = adapter

        binding.btnSwitch.setOnClickListener {
            val intent = Intent(this, ComposeActivity::class.java)
            startActivity(
                intent,
                ActivityOptions.makeSceneTransitionAnimation(this)
                    .toBundle()
            )
            finish()
        }
    }
}
