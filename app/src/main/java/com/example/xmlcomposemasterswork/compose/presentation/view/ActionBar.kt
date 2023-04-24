package com.example.xmlcomposemasterswork.compose.presentation.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R.drawable

@Composable
fun ActionBar(
    title: String = "",
    clickListener: (() -> Unit)? = null
) {
    TopAppBar(
        backgroundColor = Color.White,
        modifier = Modifier
            .height(60.dp),
        elevation = 10.dp
    ) {
        Icon(
            painter = painterResource(id = drawable.ic_back),
            contentDescription = "back",
            modifier = Modifier
                .clickable {
                    clickListener?.invoke()
                }
        )
        Text(
            text = title,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 20.dp)
        )
    }
}
