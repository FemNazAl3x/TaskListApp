package com.example.listadetareas.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listadetareas.domain.Task

@Composable
fun TaskListScreen() {

    val sampleTasks = listOf(

        Task(
            id = 1,
            title = "Ir a la UES",
            description = "Asistir a clases",
            isDone = false
        ),

        Task(
            id = 2,
            title = "Hacer tarea de Moviles Android",
            description = "Completar actividad",
            isDone = false
        ),

        Task(
            id = 3,
            title = "Estudiar Diseño Responsivo",
            description = "Repasar conceptos",
            isDone = false
        )

    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        items(sampleTasks) { task ->

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {

                    Text(
                        text = task.title,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = task.description,
                        style = MaterialTheme.typography.bodyMedium
                    )

                }

            }

        }

    }

}