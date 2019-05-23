package com.example.thanhchungnguyen.todolist.Repository

import com.example.thanhchungnguyen.todolist.Entity.FolderOrigin
import com.example.thanhchungnguyen.todolist.Entity.Task
import java.util.*

class DataStore {

    var listFolder: MutableList<FolderOrigin> = mutableListOf()
    var listTask: MutableList<Task> = mutableListOf()
    fun getFolderList(): List<FolderOrigin>   {
        var folder1 = FolderOrigin()
        folder1.folderName = "task1"
        listFolder.add(folder1)
        var folder2 = FolderOrigin()
        folder2.folderName = "task2"
        listFolder.add(folder2)
        var folder3 = FolderOrigin()
        folder3.folderName = "task3"
        listFolder.add(folder3)
        return listFolder
    }

    fun getTaskList(): List<Task> {
        var task1 = Task()
        task1.taskName = "task1"
        task1.taskId = 1
        task1.duaDate = Date()
        task1.isDone = false
        listTask.add(task1)
        var task2 = Task()
        task2.taskName = "task1"
        task2.taskId = 1
        task2.duaDate = Date()
        task2.isDone = false
        listTask.add(task2)
        return listTask
    }
}