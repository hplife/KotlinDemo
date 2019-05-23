package com.example.thanhchungnguyen.todolist.Repository

import com.example.thanhchungnguyen.todolist.Entity.FolderOrigin
import com.example.thanhchungnguyen.todolist.Entity.Task

class DataRepo {

    var  dataStore = DataStore()

    fun getFolderList(): List<FolderOrigin> {
        return dataStore.getFolderList()
    }

    fun getTaskList(): List<Task> {
        return dataStore.getTaskList()
    }
}