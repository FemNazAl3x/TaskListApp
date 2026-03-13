package com.example.listadetareas.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List

data class BottomNavItem(
    val label: String,
    val icon: ImageVector
)

@Composable
fun BottomNavigationBar() {

    val items = listOf(
        BottomNavItem("Inicio", Icons.Default.Home),
        BottomNavItem("Tareas", Icons.Default.List)
    )

    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar {

        items.forEachIndexed { index, item ->

            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                label = { Text(item.label) },
                icon = { Icon(item.icon, contentDescription = item.label) }
            )

        }

    }
}