package com.example.xmlcomposemasterswork.xml.presentation.view.citylist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel

class CityListAdapter : ListAdapter<CityUIModel, CityViewHolder>(CityItemDiffCallback()) {

    var onClickListener: ((CityUIModel) -> Unit)? = null
    var onLongClickListener: ((CityUIModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_city_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        with(holder) {
            val data = getItem(position)
            bind(data)
            itemView.setOnLongClickListener {
                onLongClickListener?.invoke(data)
                true
            }
            itemView.setOnClickListener {
                onClickListener?.invoke(data)
            }
        }
    }
}
