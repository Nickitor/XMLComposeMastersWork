package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.NoveltyModel

private const val LIST_ITEM_COUNT = 50

object NoveltySource {

    private val list =
        (1..LIST_ITEM_COUNT).map { item ->
            NoveltyModel(
                number = item.toString()
            )
        }

    fun getList() = list

}
