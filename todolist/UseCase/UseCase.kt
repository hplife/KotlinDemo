package com.example.thanhchungnguyen.todolist.UseCase

import com.example.thanhchungnguyen.todolist.Repository.DataRepo
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.TaskModel

interface UseCase {
    fun getFolderList() : List<Folder>
    fun getTodoList(): List<TaskModel>
}

class TodoListUseCase: UseCase {

    var repo = DataRepo()
    var translater = Translater()

    override fun getFolderList(): List<Folder> {
        return translater.translaterFolder(repo.getFolderList())
    }

    override fun getTodoList(): List<TaskModel> {
        return translater.translaterTask(repo.getTaskList())
    }
}