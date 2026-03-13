package com.example.listadetareas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.room.Room
import com.example.listadetareas.data.AppDatabase
import com.example.listadetareas.data.TaskEntity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "tasks_db"
        ).build()

        GlobalScope.launch {

            db.taskDao().insertTask(
                TaskEntity(
                    title = "Tarea de prueba",
                    description = "Probando Room",
                    isDone = false
                )
            )

            Log.d("ROOM_TEST", "Tarea guardada")

        }

    }

}