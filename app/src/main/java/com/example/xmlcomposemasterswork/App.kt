package com.example.xmlcomposemasterswork

import android.app.Application
import com.example.xmlcomposemasterswork.util.ActivityFrameRateTracer

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(ActivityFrameRateTracer())
    }

}
