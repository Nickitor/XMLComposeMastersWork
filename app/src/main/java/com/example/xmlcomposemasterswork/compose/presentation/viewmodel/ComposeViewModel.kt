package com.example.xmlcomposemasterswork.compose.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComposeViewModel : ViewModel() {

    private val _isXMLActive = MutableLiveData<Boolean>(false)
    private val isXMLActive: MutableLiveData<Boolean> = _isXMLActive

    fun switchToXMLButtonClicked() {
        val isXml = _isXMLActive.value ?: false
        _isXMLActive.value = !isXml
    }
}
