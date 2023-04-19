package com.example.xmlcomposemasterswork.xml.data.source

import com.example.xmlcomposemasterswork.xml.data.dto.ExperimentDto

class ExperimentSource {

    private val experimentList = listOf(
        ExperimentDto(
            id = 1,
            title = "Вложенные списки",
            description = "Эксперимент с большой вложенностью списков. " +
                    "Список верхнего уровня содержит в себе список с ещё одним списком внутри."
        )
    )

    fun getExperiments() = experimentList
}