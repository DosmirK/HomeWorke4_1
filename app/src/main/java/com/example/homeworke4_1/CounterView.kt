package com.example.homeworke4_1

interface CounterView {

    fun showCounter(count : Int)
    fun upFont(fontSize: Float)
    fun setDecrementVisibility(visible: Int)
    fun setColor(color: Int)
    fun showToast(toast: String)
}