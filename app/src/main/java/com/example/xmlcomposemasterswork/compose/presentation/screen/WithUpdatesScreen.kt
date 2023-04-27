package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.compose.presentation.view.ActionBar
import com.example.xmlcomposemasterswork.compose.presentation.view.TimerView

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun WithUpdatesScreen(
    title: String = "", backClicked: (() -> Unit)? = null
) {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        ActionBar(title = title, clickListener = {
            backClicked?.invoke()
        })
    }) {
        Column(
            modifier = Modifier.padding(
                horizontal = 12.dp,
            )
        ) {

            TimerView(
                modifier = Modifier.padding(
                    top = 8.dp,
                )
            )

            LazyColumn(
                modifier = Modifier.padding(
                    top = 10.dp
                )
            ) {
                item {
                    Row() {
                        Text(
                            text = stringResource(id = R.string.specific_order_number),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = "123",
                            fontSize = 16.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(
                                start = 10.dp
                            )
                        )
                    }
                    Text(
                        text = stringResource(id = R.string.specific_order_receiver),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Иван Иванов",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = "+7(999)-999-99-99",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = "ivanivanov@mail.ru",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.gift_card_sender),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "от кого",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.gift_card_message_text),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Поздравляю!",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.method_obtain_header),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Доставка курьером",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.specific_order_date_and_time),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Завтра, 1 мая, сб. 12:00-15:00",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.title_order_status),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Собран",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.specific_order_payment_type),
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp, bottom = 4.dp
                        )
                    )
                    Text(
                        text = "Онлайн",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                    Text(
                        text = stringResource(id = R.string.specific_order_list),
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            top = 24.dp
                        )
                    )

                    Row(
                        modifier = Modifier
                            .padding(
                                vertical = 12.dp
                            )
                            .padding(
                                top = 24.dp,
                                bottom = 50.dp
                            )
                    ) {
                        Text(
                            text = stringResource(id = R.string.specific_order_payment_amount),
                            fontSize = 24.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "1000,00 ₽",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                        )
                    }
                }
            }
        }
    }
}
