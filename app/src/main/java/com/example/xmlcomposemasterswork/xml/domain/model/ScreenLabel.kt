package com.example.xmlcomposemasterswork.xml.domain.model

sealed class ScreenLabel {

    object ListOfListsScreen : ScreenLabel()

    object ListOfDifferentItemsScreen : ScreenLabel()

    object CustomViewScreen : ScreenLabel()

    object WithUpdatesScreen : ScreenLabel()
}
