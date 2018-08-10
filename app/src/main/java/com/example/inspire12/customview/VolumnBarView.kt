package com.example.inspire12.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class VolumnBarView(context: Context, attrs: AttributeSet?) : View(context, attrs){

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = View.MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = View.MeasureSpec.getMode(heightMeasureSpec)

        val widthSize = View.MeasureSpec.getSize(widthMeasureSpec)
        val heightSize = View.MeasureSpec.getSize(heightMeasureSpec)

    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawLine(0.0F, 0.0F, 500.0F, 500.0F, Paint())
    }

}