package com.example.xmlcomposemasterswork.xml.presentation.screen.withupdates.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.OrderProduct

class WithUpdatesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvName: TextView
    private val tvAmount: TextView
    private val tvTotalPrice: TextView
    private val tvTotalPriceDecimal: TextView

    init {
        with(view) {
            tvName = findViewById(R.id.tvName)
            tvAmount = findViewById(R.id.tvAmount)
            tvTotalPrice = findViewById(R.id.tvTotalPrice)
            tvTotalPriceDecimal = findViewById(R.id.tvTotalPriceDecimal)
        }
    }

    fun bind(data: OrderProduct) {
        tvName.text = data.name
        tvAmount.text = data.weight
        tvTotalPrice.text = data.price
        tvTotalPriceDecimal.text = data.priceDecimal
    }
}
