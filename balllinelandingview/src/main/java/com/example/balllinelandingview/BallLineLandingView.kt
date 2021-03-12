package com.example.balllinelandingview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#9C27B0",
    "#1A237E",
    "#009688",
    "#FF5722"
).map {
    Color.parseColor(it)
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")
val strokeFactor : Float = 90f
val delay : Long = 20
val rFactor : Float = 10.9f
val lineFactor : Float = 3.5f
val parts : Int = 4
val scGap : Float = 0.02f / parts
