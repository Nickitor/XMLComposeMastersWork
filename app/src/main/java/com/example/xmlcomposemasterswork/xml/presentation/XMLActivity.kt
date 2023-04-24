package com.example.xmlcomposemasterswork.xml.presentation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.xmlcomposemasterswork.compose.presentation.ComposeActivity
import com.example.xmlcomposemasterswork.databinding.ActivityXmlactivityBinding
import com.example.xmlcomposemasterswork.presentation.ActivityFrameRateTracer

class XMLActivity : AppCompatActivity() {

    private lateinit var binding: ActivityXmlactivityBinding

    private val frameRateTracer = ActivityFrameRateTracer(this, "XML")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(frameRateTracer)

        binding = ActivityXmlactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fabSwitchActivity.fab.setOnClickListener {
            navigateToCompose()
        }
    }

    private fun navigateToCompose() {
        val intent = Intent(this, ComposeActivity::class.java)
        startActivity(
            intent,
            ActivityOptions.makeSceneTransitionAnimation(this)
                .toBundle()
        )
        finish()
    }
}
