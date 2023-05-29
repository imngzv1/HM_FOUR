package com.example.hm_4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    val mutable = MutableLiveData<String>()
    private var count = 0

    fun incrementCounter(){
        count++
        mutable.value = count.toString()
    }
}