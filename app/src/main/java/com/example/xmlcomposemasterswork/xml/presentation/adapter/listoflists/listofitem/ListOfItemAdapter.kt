package com.example.xmlcomposemasterswork.xml.presentation.adapter.listoflists.listofitem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.ListItemModel

class ListOfItemAdapter : RecyclerView.Adapter<ListOfItemViewHolder>() {

    var dataSet = listOf<ListItemModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListOfItemViewHolder {
        return ListOfItemViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_list, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: ListOfItemViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
