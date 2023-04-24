package com.example.xmlcomposemasterswork.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.xmlcomposemasterswork.domain.model.Screen

@Suppress("LongParameterList")
@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    mainScreenContent: (@Composable () -> Unit)? = null,
    listOfListsScreenContent: (@Composable (String?) -> Unit)? = null,
    listOfDifferentItemsContent: (@Composable (String?) -> Unit)? = null,
    customViewContent: (@Composable (String?) -> Unit)? = null,
    withUpdatesContent: (@Composable (String?) -> Unit)? = null,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(Screen.MainScreen.route) {
            mainScreenContent?.invoke()
        }

        composable(
            "${Screen.ListOfListsScreen.route}/{title}",
            arguments = listOf(navArgument("title") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            listOfListsScreenContent?.invoke(backStackEntry.arguments?.getString("title"))
        }

        composable(
            "${Screen.ListOfDifferentItemsScreen.route}/{title}",
            arguments = listOf(navArgument("title") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            listOfDifferentItemsContent?.invoke(backStackEntry.arguments?.getString("title"))
        }

        composable(
            "${Screen.CustomViewScreen.route}/{title}",
            arguments = listOf(navArgument("title") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            customViewContent?.invoke(backStackEntry.arguments?.getString("title"))
        }

        composable(
            "${Screen.WithUpdatesScreen.route}/{title}",
            arguments = listOf(navArgument("title") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            withUpdatesContent?.invoke(backStackEntry.arguments?.getString("title"))
        }
    }
}
