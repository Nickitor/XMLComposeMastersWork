package com.example.xmlcomposemasterswork.xml.presentation.view.lists.list1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.xmlcomposemasterswork.R
import com.example.xmlcomposemasterswork.xml.presentation.model.CityUIModel

class CityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var url: ImageView = view.findViewById(R.id.ivImage)
    private var city: TextView = view.findViewById(R.id.tvCity)
    private var country: TextView = view.findViewById(R.id.tvCountry)

    fun bind(data: CityUIModel) {
        Glide.with(itemView)
            .load(data.url)
            .into(url)
        city.text = data.city
        country.text = data.country
    }
}
