package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.SubscriptionModel

private const val LIST_ITEM_COUNT = 50

object SubscriptionSource {

    private val list =
        (1..LIST_ITEM_COUNT).map { item ->
            SubscriptionModel(
                number = item.toString()
            )
        }

    fun getList() = list

}
