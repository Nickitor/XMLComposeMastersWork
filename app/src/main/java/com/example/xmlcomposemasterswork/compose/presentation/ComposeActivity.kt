package com.example.xmlcomposemasterswork.compose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xmlcomposemasterswork.compose.presentation.theme.XMLComposeMastersWorkTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XMLComposeMastersWorkTheme {
                CityListPreview()
            }
        }
    }
}

@Preview
@Composable
fun CityListPreview() {
    val itemList = listOf("Item1", "Item2", "Item3", "Item4")
    LazyRow {
        items(itemList) {
            CityCard()
        }
    }
}

@Composable
fun CityCard() {
    Row(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.size(150.dp))
            Text(text = "Москва")
            Text(text = "Россия")
        }
    }
}
