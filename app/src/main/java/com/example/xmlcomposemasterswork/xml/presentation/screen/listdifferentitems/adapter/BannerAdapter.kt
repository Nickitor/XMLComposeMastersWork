package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.BannerModel

class BannerAdapter : RecyclerView.Adapter<BannerViewHolder>() {

    var dataSet = listOf<BannerModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_banners, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: BannerViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
