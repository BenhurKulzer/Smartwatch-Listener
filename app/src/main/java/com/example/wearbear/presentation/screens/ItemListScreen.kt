package com.example.wearbear.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.material.*
import com.example.wearbear.model.Item
import com.example.wearbear.viewmodel.ItemViewModel
import com.example.wearbear.presentation.components.ItemRow

@Composable
fun ItemListScreen(itemViewModel: ItemViewModel = viewModel()) {
    val items = itemViewModel.items.collectAsState().value

    val listState = rememberScalingLazyListState()

    Scaffold(
        timeText = {
            TimeText()
        },
        positionIndicator = {
            PositionIndicator(scalingLazyListState = listState)
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ScalingLazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 18.dp)
            ) {
                items(items) { item: Item ->
                    ItemRow(item = item, onClick = {
                        // Define what happens when an item is clicked
                    })
                }
            }
        }
    }
}
