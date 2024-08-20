package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    val count: MutableState<Int> = _count

    fun increment() {
        _repository.counterIncrement()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.counterDecrement()
        _count.value = _repository.getCounter().count
    }
}