package com.example.xmlcomposemasterswork.xml.data.source

import com.example.xmlcomposemasterswork.xml.domain.model.ScreenCardModel

class ExperimentSource {

    private val experimentList = listOf(
        ScreenCardModel(
            id = 1,
            title = "01",
            description = "Вложенные списки"
        )
    )

    fun getExperiments() = experimentList
}