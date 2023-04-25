package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.xmlcomposemasterswork.R.color
import com.example.xmlcomposemasterswork.compose.presentation.view.ActionBar
import com.example.xmlcomposemasterswork.compose.presentation.view.ProductCardView

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CustomViewScreen(
    title: String = "",
    backClicked: (() -> Unit)? = null
) {
    Scaffold(
        backgroundColor = colorResource(id = color.background),
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
        Column() {
            ProductCardView(
                modifier = Modifier
                    .padding(20.dp)
            )
            ProductCardView(
                modifier = Modifier
                    .padding(20.dp)
            )
            ProductCardView(
                modifier = Modifier
                    .padding(20.dp)
            )
        }
    }
}
