package com.example.inspire12.customview

import android.content.Context
import android.view.View
import java.util.jar.Attributes
import android.content.res.TypedArray
import android.graphics.Canvas
import android.util.AttributeSet


class CustomView(context: Context?, attrs: AttributeSet) : View(context) {

//    constructor(context: Context?, attrs: Attributes):this(context, attrs)

    init {
        val typedArray = context?.obtainStyledAttributes(attrs, R.styleable.PageIndicatorView)
        val count = typedArray?.getInt(R.styleable.PageIndicatorView_piv_count, 0)
        typedArray?.recycle()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = View.MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = View.MeasureSpec.getSize(widthMeasureSpec)
        val heightMode = View.MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = View.MeasureSpec.getSize(heightMeasureSpec)


    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }


    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }


}

