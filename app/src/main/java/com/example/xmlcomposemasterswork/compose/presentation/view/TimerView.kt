package com.example.xmlcomposemasterswork.compose.presentation.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.R.drawable

@SuppressLint("CoroutineCreationDuringComposition")
@Preview
@Composable
fun TimerView(
    modifier: Modifier = Modifier,
    timer: Int = 0,
) {
    Card(
        shape = RoundedCornerShape(
            size = 12.dp
        ),
        elevation = 0.dp,
        backgroundColor = colorResource(
            id = R.color.grey_alpha
        ),
        modifier = modifier
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    all = 12.dp
                )
        ) {
            Icon(
                modifier = Modifier
                    .size(
                        size = 16.dp
                    ),
                painter = painterResource(
                    id = drawable.ic_time
                ),
                contentDescription = "Timer"
            )

            Column {
                Text(
                    text = "$timer с",
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            start = 12.dp,
                        )
                )
                Text(
                    text = stringResource(
                        id = R.string.partial_order_timer
                    ),
                    fontSize = 14.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(
                            start = 12.dp
                        )
                )
            }
        }
    }
}
