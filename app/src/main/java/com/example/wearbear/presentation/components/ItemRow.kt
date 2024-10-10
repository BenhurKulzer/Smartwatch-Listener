package com.example.wearbear.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text

import com.example.wearbear.model.Item

@Composable
fun ItemRow(item: Item, onClick: () -> Unit) {
    Chip(
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(text = item.name, color = Color.LightGray, fontSize = 13.sp)
        },
        onClick = { onClick() },
        colors = ChipDefaults.primaryChipColors(
            backgroundColor = Color.DarkGray
        ),
        icon = {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = "Location",
                tint = Color.White,
                modifier = Modifier
                    .size(20.dp)
            )
        }
    )
}
