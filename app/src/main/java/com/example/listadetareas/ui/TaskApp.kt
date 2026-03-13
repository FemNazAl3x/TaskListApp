package com.example.listadetareas.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import com.example.listadetareas.ui.components.BottomNavigationBar
import com.example.listadetareas.ui.components.DrawerContent
import com.example.listadetareas.ui.components.MainContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskApp() {

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent()
            }
        }
    ) {

        Scaffold(

            topBar = {
                TopAppBar(
                    title = { Text("Lista de Tareas") }
                )
            },

            bottomBar = {
                BottomNavigationBar()
            },

            floatingActionButton = {
                FloatingActionButton(onClick = { }) {
                    Icon(Icons.Default.Add, contentDescription = "Agregar tarea")
                }
            }

        ) { paddingValues ->

            MainContent(
                modifier = Modifier.padding(paddingValues)
            )

        }

    }
}