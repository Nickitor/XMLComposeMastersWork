package com.example.xmlcomposemasterswork.presentation

import androidx.activity.ComponentActivity
import androidx.core.app.FrameMetricsAggregator
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ActivityFrameRateTracer constructor(
    private val activity: ComponentActivity,
    private val label: String = "Screen"
) : DefaultLifecycleObserver {

    private val aggregator: FrameMetricsAggregator = FrameMetricsAggregator()

    private var totalFrames = 0L
    private var slowFrames = 0L
    private var frozenFrames = 0L

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        activity.lifecycleScope.launch(Dispatchers.Default) {
            aggregator.add(activity)
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        activity.lifecycleScope.launch(Dispatchers.Default) {
            val data = aggregator.metrics ?: return@launch

            totalFrames = 0L
            slowFrames = 0L
            frozenFrames = 0L

            data[FrameMetricsAggregator.TOTAL_INDEX].let { distributions ->
                for (i in 0 until distributions.size()) {
                    val duration = distributions.keyAt(i)
                    val frameCount = distributions.valueAt(i)
                    totalFrames += frameCount
                    if (duration > SLOW_FRAME_DURATION_LIMIT)
                        slowFrames += frameCount
                    if (duration > FROZEN_FRAME_DURATION_LIMIT)
                        frozenFrames += frameCount
                }
            }
            aggregator.reset()
            val frameRateData = FrameRate(totalFrames, slowFrames, frozenFrames)

            println(label)
            println("totalFrames ${frameRateData.totalFrames}")
            println("slowFrames ${frameRateData.slowFrames}")
            println("frozenFrames ${frameRateData.frozenFrames}")
        }
        super.onStop(owner)
    }

    companion object {
        private const val SLOW_FRAME_DURATION_LIMIT = 16
        private const val FROZEN_FRAME_DURATION_LIMIT = 700
    }
}
