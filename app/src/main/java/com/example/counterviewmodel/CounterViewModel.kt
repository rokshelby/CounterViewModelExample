package com.example.counterviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _repository : CounterRepository = CounterRepository()
    //private val _count : MutableState<Int> = mutableIntStateOf(0) what I wrote
    //private val _count = mutableStateOf(0)
    //val count: State<Int> get() = _count = what I wrote

    private val _count = mutableStateOf(_repository.getCounter().count)

    val count : MutableState<Int> = _count
    fun increment(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }
    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }


}