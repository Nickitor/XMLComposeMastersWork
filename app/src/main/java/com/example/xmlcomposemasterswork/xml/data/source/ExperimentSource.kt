package com.example.xmlcomposemasterswork.xml.data.source

import com.example.xmlcomposemasterswork.xml.domain.model.ScreenCardModel
import com.example.xmlcomposemasterswork.xml.domain.model.ScreenLabel.CustomViewScreen
import com.example.xmlcomposemasterswork.xml.domain.model.ScreenLabel.ListOfDifferentItemsScreen
import com.example.xmlcomposemasterswork.xml.domain.model.ScreenLabel.ListOfListsScreen
import com.example.xmlcomposemasterswork.xml.domain.model.ScreenLabel.WithUpdatesScreen

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
