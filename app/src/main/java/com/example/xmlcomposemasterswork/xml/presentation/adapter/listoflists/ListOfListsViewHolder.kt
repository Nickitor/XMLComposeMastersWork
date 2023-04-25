package com.example.xmlcomposemasterswork.xml.presentation.adapter.listoflists

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.domain.model.ListOfListsModel
import com.example.xmlcomposemasterswork.xml.presentation.adapter.listoflists.listofitem.ListOfItemAdapter

class ListOfListsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val rvListOfList: RecyclerView

    init {
        with(view) {
            rvListOfList = findViewById(R.id.rvListOfList)
            rvListOfList.adapter = ListOfItemAdapter()
        }
    }

    fun bind(data: ListOfListsModel) {
        (rvListOfList.adapter as ListOfItemAdapter).dataSet = data.listOfItems
    }
}
