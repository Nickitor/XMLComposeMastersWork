package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.compose.navigation.AppNavGraph
import com.example.xmlcomposemasterswork.compose.presentation.screen.customview.CustomViewScreen
import com.example.xmlcomposemasterswork.compose.presentation.screen.home.HomeScreen
import com.example.xmlcomposemasterswork.compose.presentation.screen.listofdifferentitems.ListOfDifferentItemsScreen
import com.example.xmlcomposemasterswork.compose.presentation.screen.listoflists.ListOfListsScreen
import com.example.xmlcomposemasterswork.compose.presentation.screen.withupdates.WithUpdatesScreen
import com.example.xmlcomposemasterswork.compose.presentation.screen.withupdates.WithUpdatesViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun MainScreen(
    withUpdatesViewModel: WithUpdatesViewModel? = null,
    switchToXMLClickListener: (() -> Unit)? = null
) {
    val navHostController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = Color.White,
                onClick = { switchToXMLClickListener?.invoke() }
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.ic_xml),
                    contentDescription = "XML"
                )
            }
        }
    ) {
        AppNavGraph(
            navHostController = navHostController,
            mainScreenContent = {
                HomeScreen(listItemClicked = {
                    navHostController.navigate("${it.screenType.route}/${it.description}")
                })
            },
            listOfListsScreenContent = {
                ListOfListsScreen(
                    title = it.orEmpty(),
                    backClicked = {
                        navHostController.popBackStack()
                    }
                )
            },
            listOfDifferentItemsContent = {
                ListOfDifferentItemsScreen(
                    title = it.orEmpty(),
                    backClicked = {
                        navHostController.popBackStack()
                    }
                )
            },
            customViewContent = {
                CustomViewScreen(
                    title = it.orEmpty(),
                    backClicked = {
                        navHostController.popBackStack()
                    }
                )
            },
            withUpdatesContent = {
                if (withUpdatesViewModel != null) {
                    WithUpdatesScreen(
                        withUpdatesViewModel = withUpdatesViewModel,
                        title = it.orEmpty(),
                        backClicked = {
                            navHostController.popBackStack()
                            withUpdatesViewModel.stopTimer()
                        }
                    )
                }
            },
        )
    }
}
