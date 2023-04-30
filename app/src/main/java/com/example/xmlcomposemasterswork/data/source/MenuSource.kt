package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.MenuModel

private const val LIST_ITEM_COUNT = 50

object MenuSource {

    private val list =
        (1..LIST_ITEM_COUNT).map { item ->
            MenuModel(
                number = item.toString()
            )
        }

    fun getList() = list

}
