package com.example.xmlcomposemasterswork.xml.presentation.view.listoflists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.ListOfListsModel

class ListOfListsAdapter : RecyclerView.Adapter<ListOfListsViewHolder>() {

    var dataSet = listOf<ListOfListsModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListOfListsViewHolder {
        return ListOfListsViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_list_of_lists, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: ListOfListsViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
