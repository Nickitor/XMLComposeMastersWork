package com.example.xmlcomposemasterswork.compose.presentation.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ProductCardView(
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(
            size = 18.dp
        ),
        elevation = 10.dp,
        modifier = modifier
    ) {
        ProductView(
            modifier = Modifier.padding(
                horizontal = 10.dp
            )
        )
    }
}
