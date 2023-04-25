package com.example.xmlcomposemasterswork.xml.presentation.adapter.screencard

import androidx.recyclerview.widget.DiffUtil
import com.example.xmlcomposemasterswork.domain.model.ScreenCardModel

class ScreenCardDiffCallback : DiffUtil.ItemCallback<ScreenCardModel>() {
    override fun areItemsTheSame(oldItem: ScreenCardModel, newItem: ScreenCardModel): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(
        oldItem: ScreenCardModel,
        newItem: ScreenCardModel
    ): Boolean {
        return oldItem == newItem
    }
}
