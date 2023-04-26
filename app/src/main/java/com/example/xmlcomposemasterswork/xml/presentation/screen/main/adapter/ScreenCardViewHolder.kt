package com.example.xmlcomposemasterswork.xml.presentation.screen.main.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.ScreenCardModel

class ScreenCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var title: TextView = view.findViewById(R.id.tvTitle)
    private var description: TextView = view.findViewById(R.id.tvDescription)

    fun bind(data: ScreenCardModel) {
        title.text = data.title
        description.text = data.description
    }
}
