package com.example.xmlcomposemasterswork.compose.presentation.template

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xmlcomposemasterswork.R

@Preview
@Composable
fun TemplateCard() {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Green)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = "Android")
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Jetpack Compose")
        }
    }
}
