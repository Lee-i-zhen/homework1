package com.example.homework1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button2.setOnClickListener {
            addtemp(it)
        }
    }

    private fun addtemp(view: View) {

        binding.apply {
            val a = input.text.toString()?.toDouble()
            val result = (a - 32) * 5 / 9
            output.text = "%.2f".format(result)

        }
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0) // 隱藏鍵盤
    }



}


