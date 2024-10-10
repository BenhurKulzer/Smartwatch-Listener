package com.example.wearbear.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

import com.example.wearbear.model.Item

class ItemViewModel : ViewModel() {
    private val _items = MutableStateFlow<List<Item>>(emptyList())
    val items: StateFlow<List<Item>> get() = _items

    init {
        loadItems()
    }

    private fun loadItems() {
        viewModelScope.launch {
            _items.value = listOf(
                Item(1, "Robot 1"),
                Item(2, "Robot 2"),
                Item(3, "Robot 3"),
                Item(4, "Robot 4"),
                Item(5, "Robot 5"),
                Item(6, "Robot 6"),
                Item(7, "Robot 7"),
                Item(8, "Robot 8"),
                Item(9, "Robot 9"),
                Item(10, "Robot 10"),
                Item(11, "Robot 11"),
                Item(12, "Robot 12"),
                Item(13, "Robot 13"),
                Item(14, "Robot 14"),
                Item(15, "Robot 15"),
            )
        }
    }
}
