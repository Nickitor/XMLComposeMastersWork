package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.Screen.CustomViewScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.ListOfDifferentItemsScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.ListOfListsScreen
import com.example.xmlcomposemasterswork.domain.model.Screen.WithUpdatesScreen
import com.example.xmlcomposemasterswork.domain.model.ScreenCardModel

class ExperimentSource {

    private val experimentList = listOf(
        ScreenCardModel(
            screenType = ListOfListsScreen,
            title = "01",
            description = "Вложенные списки"
        ),
        ScreenCardModel(
            screenType = ListOfDifferentItemsScreen,
            title = "02",
            description = "Список с разными элементами"
        ),
        ScreenCardModel(
            screenType = CustomViewScreen,
            title = "03",
            description = "Вложенные Custom View"
        ),
        ScreenCardModel(
            screenType = WithUpdatesScreen,
            title = "04",
            description = "С обновлениями экрана"
        ),
    )

    fun getExperiments() = experimentList
}
