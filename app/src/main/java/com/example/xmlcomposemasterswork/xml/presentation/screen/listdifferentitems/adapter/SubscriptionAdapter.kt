package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.SubscriptionModel

class SubscriptionAdapter : RecyclerView.Adapter<SubscriptionViewHolder>() {

    var dataSet = listOf<SubscriptionModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): SubscriptionViewHolder {
        return SubscriptionViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_subscriptions, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: SubscriptionViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
