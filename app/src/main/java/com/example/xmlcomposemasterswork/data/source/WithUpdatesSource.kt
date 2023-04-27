package com.example.xmlcomposemasterswork.data.source

import com.example.xmlcomposemasterswork.domain.model.OrderProduct

object WithUpdatesSource {

    private val list =
        (1..10).map {
            OrderProduct(
                id = it.toString()
            )
        }

    fun getList() = list

}
