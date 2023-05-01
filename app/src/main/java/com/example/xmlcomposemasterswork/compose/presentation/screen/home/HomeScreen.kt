package com.example.xmlcomposemasterswork.compose.presentation.screen.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R.string
import com.example.xmlcomposemasterswork.compose.presentation.view.ItemScreenCard
import com.example.xmlcomposemasterswork.data.source.ExperimentSource
import com.example.xmlcomposemasterswork.domain.model.ScreenCardModel

@Composable
fun HomeScreen(
    listItemClicked: ((ScreenCardModel) -> Unit)? = null
) {

    val experimentList = ExperimentSource.getExperiments()

    LazyColumn {
        item {
            Text(
                text = stringResource(string.compose_main_screen_title),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )
        }
        items(experimentList) { listItem ->
            ItemScreenCard(
                listItem,
                clickListener = {
                    listItemClicked?.invoke(listItem)
                }
            )
        }
    }
}
