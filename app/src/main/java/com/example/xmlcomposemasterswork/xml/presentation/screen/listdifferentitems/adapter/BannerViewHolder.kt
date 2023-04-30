package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.BannerModel

class BannerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val item: TextView

    init {
        with(view) {
            item = findViewById(R.id.tvNumber)
        }
    }

    fun bind(data: BannerModel) {
        item.text = data.number
    }
}
