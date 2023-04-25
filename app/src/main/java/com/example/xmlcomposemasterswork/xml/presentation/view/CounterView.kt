package com.example.xmlcomposemasterswork.xml.presentation.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.xmlcomposemasterswork.databinding.CounterViewBinding

class CounterView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayoutCompat(context, attrs, defStyleAttr) {

    private val binding = CounterViewBinding.inflate(LayoutInflater.from(context), this)

}
