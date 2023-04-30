package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlcomposemasterswork.R.layout
import com.example.xmlcomposemasterswork.domain.model.MenuModel

class MenuAdapter : RecyclerView.Adapter<MenuViewHolder>() {

    var dataSet = listOf<MenuModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(layout.item_menu, viewGroup, false)
        )
    }

    override fun onBindViewHolder(viewHolder: MenuViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}
