package com.example.homeworke4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworke4_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        presenter.initView(this)
    }

    private fun initClickers() {
        with(binding){
            btnPlus.setOnClickListener {
                presenter.inc()
            }
            btnMinus.setOnClickListener {
                presenter.dec()
            }
        }
    }

    override fun showCounter(count: Int) {
        binding.tvResult.text = count.toString()
    }

    override fun upFont(fontSize: Float) {
        binding.tvResult.textSize = fontSize
    }

    override fun setDecrementVisibility(visible: Int) {
        binding.btnMinus.visibility = visible
    }

    override fun setColor(color: Int) {
        binding.tvResult.setTextColor(color)
    }

    override fun showToast(toast: String) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show()
    }
}