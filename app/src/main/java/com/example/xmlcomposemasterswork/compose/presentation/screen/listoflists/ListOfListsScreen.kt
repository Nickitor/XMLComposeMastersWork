package com.example.xmlcomposemasterswork.compose.presentation.screen.listoflists

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.compose.presentation.view.ActionBar
import com.example.xmlcomposemasterswork.compose.presentation.view.ItemList
import com.example.xmlcomposemasterswork.data.source.ListOfListsSource

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun ListOfListsScreen(
    title: String = "",
    backClicked: (() -> Unit)? = null
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = colorResource(id = R.color.background),
        topBar = {
            ActionBar(
                title = title,
                clickListener = {
                    backClicked?.invoke()
                }
            )
        }
    ) {

        val list = ListOfListsSource.getList()

        LazyColumn {
            items(list) { item ->
                LazyRow(
                    Modifier
                        .padding(vertical = 20.dp)
                ) {
                    items(item.listOfItems) {
                        ItemList(it.number)
                    }
                }
            }
        }
    }
}
