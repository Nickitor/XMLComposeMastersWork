package com.example.xmlcomposemasterswork.compose.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.xmlcomposemasterswork.compose.presentation.viewmodel.ComposeViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(
    viewModel: ComposeViewModel,
    switchToXMLClickListener: (() -> Unit)?
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) {
        Switch(checked = true,
            modifier = Modifier.padding(bottom = 100.dp),
            onCheckedChange = {
                switchToXMLClickListener?.invoke()
            })
    }
}
