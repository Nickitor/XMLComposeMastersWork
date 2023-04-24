package com.example.xmlcomposemasterswork.domain.model

sealed class Screen(
    val route: String
) {
    object MainScreen : Screen(ROUTE_MAIN)

    object ListOfListsScreen : Screen(ROUTE_LIST_OF_LISTS)

    object ListOfDifferentItemsScreen : Screen(ROUTE_LIST_OF_DIFFERENT_ITEMS)

    object CustomViewScreen : Screen(ROUTE_CUSTOM_VIEW)

    object WithUpdatesScreen : Screen(ROUTE_WITH_UPDATES)

    private companion object {

        const val ROUTE_MAIN = "main"
        const val ROUTE_LIST_OF_LISTS = "list_of_lists"
        const val ROUTE_LIST_OF_DIFFERENT_ITEMS = "list_of_different_items"
        const val ROUTE_CUSTOM_VIEW = "custom_view"
        const val ROUTE_WITH_UPDATES = "with_updates"
    }
}
