package com.example.wearbear.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels

import com.example.wearbear.viewmodel.ItemViewModel
import com.example.wearbear.presentation.screens.ItemListScreen

class MainActivity : ComponentActivity() {
    private val itemViewModel: ItemViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItemListScreen(itemViewModel)
        }
    }
}