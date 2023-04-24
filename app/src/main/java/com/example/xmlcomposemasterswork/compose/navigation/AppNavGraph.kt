package com.example.xmlcomposemasterswork.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.xmlcomposemasterswork.domain.model.Screen

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    mainScreenContent: @Composable () -> Unit,
    listOfListsScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(Screen.MainScreen.route) {
            mainScreenContent()
        }
        composable(Screen.ListOfListsScreen.route) {
            listOfListsScreenContent()
        }
    }
}
