package com.example.xmlcomposemasterswork.xml.presentation.screen.withupdates

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.xmlcomposemasterswork.domain.model.WithUpdatesModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class WithUpdatesViewModel : ViewModel() {

    private val _state = MutableLiveData(WithUpdatesModel())
    val state: MutableLiveData<WithUpdatesModel> = _state

    var timerJob: Job? = null

    fun startTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (true) {
                delay(TIMER_PERIOD)
                val currentState = state.value ?: WithUpdatesModel()
                _state.value = currentState.copy(
                    timer = currentState.timer + 1,
                    timerText = "${(currentState.timer + 1)} с"
                )
            }
        }
    }

    fun stopTimer() {
        timerJob?.cancel()
        timerJob = null
    }

    private companion object {
        private const val TIMER_PERIOD = 1000L
    }
}
