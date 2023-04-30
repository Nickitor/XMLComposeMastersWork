package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.StoryModel

class StoryAdapter : RecyclerView.Adapter<StoryViewHolder>() {

    var dataSet = listOf<StoryModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_story, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: StoryViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
