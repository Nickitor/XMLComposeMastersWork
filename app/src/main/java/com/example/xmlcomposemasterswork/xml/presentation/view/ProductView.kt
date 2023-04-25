package com.example.xmlcomposemasterswork.xml.presentation.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.xmlcomposemasterswork.databinding.ProductViewBinding

class ProductView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding = ProductViewBinding.inflate(LayoutInflater.from(context), this)

}
