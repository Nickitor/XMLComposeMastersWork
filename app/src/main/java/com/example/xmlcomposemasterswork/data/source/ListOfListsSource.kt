package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.ListItemModel
import com.example.xmlcomposemasterswork.domain.model.ListOfListsModel

private const val LIST_ITEM_COUNT = 10
private const val LIST_OF_LISTS_COUNT = 10

object ListOfListsSource {

    private val list =
        (1..LIST_OF_LISTS_COUNT).map { listOfList ->
            ListOfListsModel(
                listOfItems = (1..LIST_ITEM_COUNT).map { item ->
                    ListItemModel(
                        number = item.toString()
                    )
                }
            )
        }

    fun getList() = list

}
