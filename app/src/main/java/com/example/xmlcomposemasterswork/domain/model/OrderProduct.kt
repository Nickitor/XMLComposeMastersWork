package com.example.xmlcomposemasterswork.domain.model

data class OrderProduct(
    val id: String,
    val name: String = "Яблоки Голден Делишес",
    val weight: String = "3 кг",
    val price: String = "39",
    val priceDecimal: String = "90",
)
