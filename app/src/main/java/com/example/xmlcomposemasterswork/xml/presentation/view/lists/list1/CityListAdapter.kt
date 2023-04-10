package com.example.xmlcomposemasterswork.xml.presentation.view.lists.list1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel

class CityListAdapter : ListAdapter<CityUIModel, CityViewHolder>(CityItemDiffCallback()) {

    var onClickListener: ((CityUIModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(
            LayoutInflater.from(parent.context).inflate(layout.item_city_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        with(holder) {
            val data = getItem(position)
            bind(data)
            itemView.setOnClickListener {
                onClickListener?.invoke(data)
            }
        }
    }
}
