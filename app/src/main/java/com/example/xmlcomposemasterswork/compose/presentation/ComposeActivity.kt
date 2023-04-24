package com.example.xmlcomposemasterswork.compose.presentation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.LocalContext
import com.example.xmlcomposemasterswork.compose.presentation.screen.MainScreen
import com.example.xmlcomposemasterswork.compose.presentation.theme.XMLComposeMastersWorkTheme
import com.example.xmlcomposemasterswork.compose.presentation.viewmodel.ComposeViewModel
import com.example.xmlcomposemasterswork.presentation.ActivityFrameRateTracer
import com.example.xmlcomposemasterswork.xml.presentation.XMLActivity


class ComposeActivity : ComponentActivity() {

    private val viewModel by viewModels<ComposeViewModel>()

    private val frameRateTracer = ActivityFrameRateTracer(this, "Compose")

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(frameRateTracer)

        setContent {
            XMLComposeMastersWorkTheme {

                val isXMLActive by viewModel.isXMLActive.observeAsState(false)

                if (isXMLActive == true) {
                    NavigateToXMLActivity()
                }

                MainScreen(
                    viewModel = viewModel,
                    switchToXMLClickListener = {
                        viewModel.switchToXMLButtonClicked()
                    }
                )
            }
        }
    }

    @Composable
    private fun NavigateToXMLActivity() {
        val activity = LocalContext.current
        activity.startActivity(
            Intent(
                this@ComposeActivity, XMLActivity::class.java
            )
        )
        finish()
    }
}
