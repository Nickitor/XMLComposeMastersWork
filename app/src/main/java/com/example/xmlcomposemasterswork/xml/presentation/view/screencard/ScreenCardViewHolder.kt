package com.example.xmlcomposemasterswork.xml.presentation.view.screencard

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.xml.presentation.model.ScreenCardUiModel

class ScreenCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var title: TextView = view.findViewById(R.id.tvTitle)
    private var description: TextView = view.findViewById(R.id.tvDescription)

    fun bind(data: ScreenCardUiModel) {
        title.text = data.title
        description.text = data.description
    }
}
