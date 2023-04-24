package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.xmlcomposemasterswork.compose.navigation.AppNavGraph
import com.example.xmlcomposemasterswork.compose.presentation.viewmodel.ComposeViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(
    viewModel: ComposeViewModel, switchToXMLClickListener: (() -> Unit)?
) {
    val navHostController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
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
                WithUpdatesScreen(
                    title = it.orEmpty(),
                    backClicked = {
                        navHostController.popBackStack()
                    }
                )
            },
        )

        Switch(checked = true, modifier = Modifier.padding(bottom = 100.dp), onCheckedChange = {
            switchToXMLClickListener?.invoke()
        })
    }
}
