package com.example.countermvvm_month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.hm_4.databinding.ActivityMainBinding
import com.example.hm_4.CounterViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counterViewModel = CounterViewModel()

        binding.btnPlus.setOnClickListener {
            counterViewModel.incrementCounter()
        }
        counterViewModel.mutable.observe(this, Observer {
            binding.tvNumber.text = it.toString()
        })
    }
}