package com.frey.msu.trafficlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import com.frey.msu.trafficlight.databinding.ActivityMainBinding
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var isStop: Boolean = true
    var isGo: Boolean = false
    var isWait: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (isStop) {
                binding.button.setBackgroundColor(Color.RED)
                binding.button.text = "Stop"
                binding.button.setTextColor(Color.WHITE)
                binding.redlight.visibility = View.VISIBLE
                binding.yellowlight.visibility = View.INVISIBLE
                binding.greenlight.visibility = View.INVISIBLE
                isStop = false
                isGo = true
                isWait = false
        } else if (isGo) {
                binding.button.setBackgroundColor(Color.GREEN)
                binding.button.text = "Go"
                binding.redlight.visibility = View.INVISIBLE
                binding.yellowlight.visibility = View.INVISIBLE
                binding.greenlight.visibility = View.VISIBLE
                isStop = false
                isGo = false
                isWait = true
            } else {
                binding.button.setBackgroundColor(Color.YELLOW)
                binding.button.text = "Wait"
                binding.button.setTextColor(Color.BLACK)
                binding.redlight.visibility = View.INVISIBLE
                binding.yellowlight.visibility = View.VISIBLE
                binding.greenlight.visibility = View.INVISIBLE
                isStop = true
                isGo = false
                isWait = false
            }

            }
    }
}