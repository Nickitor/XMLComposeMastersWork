package com.example.xmlcomposemasterswork.util

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.FrameMetricsAggregator
import androidx.core.util.forEach

class ActivityFrameRateTracer : Application.ActivityLifecycleCallbacks {

    private val frameAggregator: FrameMetricsAggregator = FrameMetricsAggregator()

    private var totalFrames = 0L
    private var slowFrames = 0L
    private var frozenFrames = 0L

    override fun onActivityResumed(activity: Activity) {
        frameAggregator.add(activity)
    }

    override fun onActivityPaused(activity: Activity) {
        logResult()
        Toast.makeText(
            activity,
            "totalFrames $totalFrames \n slowFrames $slowFrames \n frozenFrames $frozenFrames",
            Toast.LENGTH_LONG
        ).show()
        frameAggregator.remove(activity)
        frameAggregator.reset()
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) = Unit

    override fun onActivityStarted(activity: Activity) = Unit

    override fun onActivityStopped(activity: Activity) = Unit

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit

    override fun onActivityDestroyed(activity: Activity) = Unit

    private fun logResult() {
        val data = frameAggregator.metrics?.getOrNull(FrameMetricsAggregator.TOTAL_INDEX) ?: return
        totalFrames = 0
        slowFrames = 0
        frozenFrames = 0
        data.forEach { frameTime, frameCount ->
            totalFrames += frameCount
            if (frameTime >= FROZEN_FRAME_DURATION_LIMIT) {
                frozenFrames += frameCount
            } else {
                if (frameTime >= SLOW_FRAME_DURATION_LIMIT) {
                    slowFrames += frameCount
                }
            }
        }
        Log.d("totalFrames", totalFrames.toString())
        Log.d("slowFrames", slowFrames.toString())
        Log.d("frozenFrames", frozenFrames.toString())
    }

    companion object {
        private const val SLOW_FRAME_DURATION_LIMIT = 17
        private const val FROZEN_FRAME_DURATION_LIMIT = 700
    }
}
