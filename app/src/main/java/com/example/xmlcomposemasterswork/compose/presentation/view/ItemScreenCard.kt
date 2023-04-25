package com.example.xmlcomposemasterswork.compose.presentation.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.domain.model.ScreenCardModel

@Composable
fun ItemScreenCard(
    screenCardModel: ScreenCardModel,
    clickListener: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer(translationX = -70f)
            .padding(vertical = 10.dp)
            .clickable { clickListener() }
    ) {
        Row(
            modifier = Modifier
                .padding(
                    vertical = 10.dp,
                    horizontal = 30.dp
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = screenCardModel.title,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(
                        start = 10.dp
                    ),
                text = screenCardModel.description,
                color = Color.Black,
                fontSize = 18.sp,
            )
        }
    }
}
