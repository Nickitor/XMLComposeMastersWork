package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.xmlcomposemasterswork.compose.presentation.view.ActionBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListOfDifferentItemsScreen(
    title: String = "",
    backClicked: (() -> Unit)? = null
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ActionBar(
                title = title,
                clickListener = {
                    backClicked?.invoke()
                }
            )
        }
    ) {
        Text(text = "ListOfDifferentItemsScreen")
    }
}
