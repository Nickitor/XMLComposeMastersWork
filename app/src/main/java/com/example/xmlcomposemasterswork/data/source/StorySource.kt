package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.StoryModel

private const val LIST_ITEM_COUNT = 50

object StorySource {

    private val list =
        (1..LIST_ITEM_COUNT).map { item ->
            StoryModel(
                number = item.toString()
            )
        }

    fun getList() = list

}
