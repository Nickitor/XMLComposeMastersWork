package com.example.xmlcomposemasterswork.util

data class FrameRate(
    var totalFrames: Long = 0L,
    var slowFrames: Long = 0,
    var frozenFrames: Long = 0L,
)