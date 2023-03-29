package com.example.xmlcomposemasterswork.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.xmlcomposemasterswork.compose.theme.XMLComposeMastersWorkTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XMLComposeMastersWorkTheme {
            }
        }
    }
}
