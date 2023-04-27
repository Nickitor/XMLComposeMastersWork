package com.example.xmlcomposemasterswork.xml.presentation.screen.withupdates.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.OrderProduct

class WithUpdatesAdapter : RecyclerView.Adapter<WithUpdatesViewHolder>() {

    var dataSet = listOf<OrderProduct>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): WithUpdatesViewHolder {
        return WithUpdatesViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_order_product, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: WithUpdatesViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
