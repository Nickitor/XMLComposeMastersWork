package com.example.xmlcomposemasterswork.compose.presentation.screen.listofdifferentitems

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.example.xmlcomposemasterswork.compose.presentation.view.BannerView
import com.example.xmlcomposemasterswork.compose.presentation.view.MenuView
import com.example.xmlcomposemasterswork.compose.presentation.view.NoveltyView
import com.example.xmlcomposemasterswork.compose.presentation.view.StoryView
import com.example.xmlcomposemasterswork.compose.presentation.view.SubscriptionView
import com.example.xmlcomposemasterswork.data.source.BannersSource
import com.example.xmlcomposemasterswork.data.source.StorySource

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun ListOfDifferentItemsScreen(
    title: String = "",
    backClicked: (() -> Unit)? = null
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ActionBar(
                title = title,
                clickListener = {
                    backClicked?.invoke()
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(
                    horizontal = 12.dp
                )
        ) {
            item {
                Text(
                    text = stringResource(
                        id = R.string.stories
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            item {
                LazyRow {
                    items(StorySource.getList()) { item ->
                        StoryView(
                            text = item.number
                        )
                    }
                }
            }
            item {
                Text(
                    text = stringResource(
                        id = R.string.banners
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            item {
                LazyRow {
                    items(BannersSource.getList()) { item ->
                        BannerView(
                            text = item.number
                        )
                    }
                }
            }
            item {
                Text(
                    text = stringResource(
                        id = R.string.menu
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            item {
                LazyRow {
                    items(BannersSource.getList()) { item ->
                        MenuView(
                            item.number
                        )
                    }
                }
            }
            item {
                Text(
                    text = stringResource(
                        id = R.string.subscriptions
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            item {
                LazyRow {
                    items(BannersSource.getList()) { item ->
                        Box(
                            modifier = Modifier
                                .fillParentMaxWidth()
                        ) {
                            SubscriptionView(
                                text = item.number
                            )
                        }
                    }
                }
            }
            item {
                Text(
                    text = stringResource(
                        id = R.string.novelties
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black
                )
            }
            item {
                LazyRow {
                    items(BannersSource.getList()) { item ->
                        NoveltyView(
                            text = item.number
                        )
                    }
                }
            }
        }
    }
}
