package com.example.xmlcomposemasterswork.compose.presentation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.ui.platform.LocalContext
import com.example.xmlcomposemasterswork.compose.presentation.screen.MainScreen
import com.example.xmlcomposemasterswork.compose.presentation.theme.XMLComposeMastersWorkTheme
import com.example.xmlcomposemasterswork.compose.presentation.viewmodel.ComposeViewModel
import com.example.xmlcomposemasterswork.xml.presentation.XMLActivity


class ComposeActivity : ComponentActivity() {

    private val viewModel by viewModels<ComposeViewModel>()

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val activity = LocalContext.current
            XMLComposeMastersWorkTheme {
                MainScreen(switchToXMLClickListener = {
                    activity.startActivity(
                        Intent(
                            this@ComposeActivity, XMLActivity::class.java
                        )
                    )
                    finish()
                })
            }
        }
    }
}
