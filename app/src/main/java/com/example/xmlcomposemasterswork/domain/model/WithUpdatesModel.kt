package com.example.xmlcomposemasterswork.domain.model

data class WithUpdatesModel(
    val timer: Int = 0,
    val timerText: String = "0 c",
    val orderId: String = "123",
    val receiverName: String = "Иван Иванов",
    val receiverPhone: String = "+7(999)-999-99-99",
    val receiverEmail: String = "ivanivanov@mail.ru",
    val senderName: String = "от кого",
    val giftMessageText: String = "Поздравляю!",
    val deliveryMethod: String = "Доставка курьером",
    val dateTime: String = "Завтра, 1 мая, сб. 12:00-15:00",
    val orderStatus: String = "Собран",
    val paymentMethod: String = "Онлайн",
    val order: List<OrderProduct> = ((1..10).map { OrderProduct(it.toString()) }),
    val totalPrice: String = "1000,00 ₽",
)
