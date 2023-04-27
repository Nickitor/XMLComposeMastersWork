package com.example.xmlcomposemasterswork.compose.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.OrderProduct

@Composable
fun OrderProductView(
    product: OrderProduct
) {
    Row(
        modifier = Modifier
            .padding(
                vertical = 16.dp
            )
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.product),
            contentDescription = "Image",
            modifier = Modifier
                .size(96.dp)
        )
        Column(
            modifier = Modifier
                .padding(
                    start = 8.dp
                )
        ) {
            Text(
                text = product.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(
                text = product.weight,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(
                        top = 12.dp
                    )
            )
            Row() {
                Text(
                    text = product.price,
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                )
                Text(
                    text = product.priceDecimal,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 2.dp
                        )
                )
                Text(
                    text = stringResource(id = R.string.rouble),
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 2.dp
                        )
                )
            }
        }
    }
}
