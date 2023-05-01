package com.example.xmlcomposemasterswork.compose.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R

@Preview
@Composable
fun ProductView(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .height(
                intrinsicSize = IntrinsicSize.Max
            )
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .weight(
                    weight = 1f
                )
                .padding(
                    end = 12.dp
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(
                        id = R.drawable.product
                    ),
                    contentDescription = "Product",
                    modifier = Modifier.size(
                        size = 40.dp
                    )
                )
                Column {
                    Text(
                        text = "Артикул 123456789",
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(
                                start = 8.dp
                            )
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Яблоко Голден Делишес",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(
                                start = 8.dp
                            )
                            .fillMaxWidth()
                    )
                    Text(
                        text = "105 ₽ за кг",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(
                                start = 8.dp
                            )
                            .fillMaxWidth()
                    )
                }
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Товар не доступен",
                    color = colorResource(
                        id = R.color.error
                    ),
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(
                            start = 48.dp,
                            top = 8.dp,
                            bottom = 6.dp
                        )
                        .fillMaxWidth()
                )
                CounterView()
                Text(
                    text = "Товара меньше, чем заказывали",
                    color = Color.White,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(
                            top = 8.dp,
                            bottom = 10.dp
                        )
                        .background(
                            colorResource(
                                id = R.color.error
                            )
                        )
                        .fillMaxWidth()
                )
            }
        }
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(
                    id = R.color.grey
                )
            ),
            onClick = { },
            modifier = Modifier
                .fillMaxHeight()
                .padding(
                    all = 4.dp
                )
                .size(
                    size = 40.dp
                )
        ) {
            Text(
                text = "ДОБАВИТЬ"
            )
        }
    }
}
