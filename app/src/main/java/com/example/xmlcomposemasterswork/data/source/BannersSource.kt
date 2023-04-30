package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.BannerModel

private const val LIST_ITEM_COUNT = 50

object BannersSource {

    private val list =
        (1..LIST_ITEM_COUNT).map { item ->
            BannerModel(
                number = item.toString()
            )
        }

    fun getList() = list

}
