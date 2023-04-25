package com.example.xmlcomposemasterswork.xml.presentation.view.listoflists.listofitem

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.ListItemModel

class ListOfItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val item: TextView

    init {
        with(view) {
            item = findViewById(R.id.tvNumber)
        }
    }

    fun bind(data: ListItemModel) {
        item.text = data.number
    }
}
