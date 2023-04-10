package com.example.xmlcomposemasterswork.xml.presentation.view.lists.list1

import androidx.recyclerview.widget.DiffUtil
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel

class CityItemDiffCallback : DiffUtil.ItemCallback<CityUIModel>() {
    override fun areItemsTheSame(oldItem: CityUIModel, newItem: CityUIModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CityUIModel, newItem: CityUIModel): Boolean {
        return oldItem == newItem
    }
}
