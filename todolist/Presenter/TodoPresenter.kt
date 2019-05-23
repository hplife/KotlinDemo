package com.example.thanhchungnguyen.todolist.Presenter

import com.example.thanhchungnguyen.todolist.UseCase.TodoListUseCase
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.TaskModel

class TodoPresenter {

    var todoUseCase = TodoListUseCase()

    fun getFolderList():List<Folder> {
        return todoUseCase.getFolderList()
    }

    fun getTaskList():List<TaskModel> {
        return todoUseCase.getTodoList()
    }
}