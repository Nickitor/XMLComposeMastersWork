package com.example.xmlcomposemasterswork.compose.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComposeViewModel : ViewModel() {

    private val _isXMLActive = MutableLiveData(false)
    val isXMLActive: MutableLiveData<Boolean> = _isXMLActive

    fun switchToXMLButtonClicked() {
        val isXml = isXMLActive.value ?: false
        _isXMLActive.value = !isXml
    }
}
