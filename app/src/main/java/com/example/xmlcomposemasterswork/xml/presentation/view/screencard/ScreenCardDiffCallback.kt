package com.example.xmlcomposemasterswork.xml.presentation.view.screencard

import androidx.recyclerview.widget.DiffUtil
import com.example.xmlcomposemasterswork.xml.presentation.model.ScreenCardUiModel

class ScreenCardDiffCallback : DiffUtil.ItemCallback<ScreenCardUiModel>() {
    override fun areItemsTheSame(oldItem: ScreenCardUiModel, newItem: ScreenCardUiModel): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(
        oldItem: ScreenCardUiModel,
        newItem: ScreenCardUiModel
    ): Boolean {
        return oldItem == newItem
    }
}
