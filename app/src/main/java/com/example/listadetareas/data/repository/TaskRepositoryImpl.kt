package com.example.listadetareas.data.repository

import com.example.listadetareas.data.TaskDao
import com.example.listadetareas.data.TaskEntity
import com.example.listadetareas.domain.Task
import com.example.listadetareas.domain.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskRepositoryImpl(

    private val taskDao: TaskDao

) : TaskRepository {

    override fun getTasks(): Flow<List<Task>> {

        return taskDao.getAllTasks().map { list ->

            list.map {

                Task(

                    id = it.id,

                    title = it.title,

                    description = it.description,

                    isDone = it.isDone

                )

            }

        }

    }

    override suspend fun insertTask(task: Task) {

        taskDao.insertTask(

            TaskEntity(

                id = task.id,

                title = task.title,

                description = task.description,

                isDone = task.isDone

            )

        )

    }

    override suspend fun deleteTask(task: Task) {

        taskDao.deleteTask(

            TaskEntity(

                id = task.id,

                title = task.title,

                description = task.description,

                isDone = task.isDone

            )

        )

    }

}