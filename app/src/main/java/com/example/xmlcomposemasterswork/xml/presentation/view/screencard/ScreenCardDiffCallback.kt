package com.example.xmlcomposemasterswork.xml.presentation.view.screencard

import androidx.recyclerview.widget.DiffUtil
import com.example.xmlcomposemasterswork.xml.domain.model.ScreenCardModel

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
