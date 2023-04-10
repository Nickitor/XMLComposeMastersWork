package com.example.xmlcomposemasterswork.xml.presentation.view.screencard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.xml.presentation.model.ScreenCardUiModel

class ScreenCardAdapter :
    ListAdapter<ScreenCardUiModel, ScreenCardViewHolder>(ScreenCardDiffCallback()) {

    var onClickListener: ((ScreenCardUiModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScreenCardViewHolder {
        return ScreenCardViewHolder(
            LayoutInflater.from(parent.context).inflate(layout.item_screen_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ScreenCardViewHolder, position: Int) {
        with(holder) {
            val data = getItem(position)
            bind(data)
            itemView.setOnClickListener {
                onClickListener?.invoke(data)
            }
        }
    }
}
