package com.shivank.wowweather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shivank.wowweather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val apiKey="8eeff32f4c1d41d0af4140646211012"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = (binding.root)
        setContentView(view)

        binding.mainViewTemperature.text="36 C"
    }
}