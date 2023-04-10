package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(
    switchToXMLClickListener: (() -> Unit)?
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CityListPreview()
            Spacer(modifier = Modifier.weight(1f))
            Switch(checked = true,
                modifier = Modifier.padding(bottom = 100.dp),
                onCheckedChange = {
                    switchToXMLClickListener?.invoke()
                })
        }
    }
}

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
        modifier = Modifier.padding(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.size(150.dp))
            Text(text = "Москва")
            Text(text = "Россия")
        }
    }
}
