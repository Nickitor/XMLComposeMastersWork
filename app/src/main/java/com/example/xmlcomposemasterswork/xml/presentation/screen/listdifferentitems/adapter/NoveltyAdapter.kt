package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.NoveltyModel

class NoveltyAdapter : RecyclerView.Adapter<NoveltyViewHolder>() {

    var dataSet = listOf<NoveltyModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): NoveltyViewHolder {
        return NoveltyViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_novelty, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: NoveltyViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
