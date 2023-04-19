package com.example.xmlcomposemasterswork.xml.presentation.mapper

import com.example.xmlcomposemasterswork.xml.data.dto.ExperimentDto
import com.example.xmlcomposemasterswork.xml.presentation.model.ScreenCardUiModel

fun ExperimentDto.map(): ScreenCardUiModel =
    ScreenCardUiModel(
        id = id,
        title = title,
        description = description
    )