package com.example.homeworke4_1

import android.graphics.Color
import android.view.View

class Presenter {
    private var model = CounterModel()
    private lateinit var view: CounterView

    fun inc(){
        model.increment()
        view.showCounter(model.count)
        setTextSize()
        decrementVisibility()
        setTextColor()
        showToast()
    }

    fun dec(){
        model.decrement()
        view.showCounter(model.count)
        setTextSize()
        decrementVisibility()
        setTextColor()
        showToast()
    }

    private fun setTextSize(){
        if (model.count == 5){
            view.upFont(100f)
        }else{
            view.upFont(30f)
        }
    }

    fun initView(view: CounterView){
        this.view = view
    }

    private fun decrementVisibility(){
        if (model.count < 0){
            view.setDecrementVisibility(View.GONE)
        }else{
            view.setDecrementVisibility(View.VISIBLE)
        }
    }

     private fun setTextColor(){
        if (model.count == 15){
            view.setColor(Color.GREEN)
        }else{
            view.setColor(Color.BLACK)
        }
    }

    private fun showToast(){
        if (model.count == 10){
            view.showToast("Поздравляем!")
        }
    }
}