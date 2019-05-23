package com.example.thanhchungnguyen.todolist.UseCase

import com.example.thanhchungnguyen.todolist.Entity.FolderOrigin
import com.example.thanhchungnguyen.todolist.Entity.Task
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.TaskModel

class Translater {

    fun translaterFolder(originList:List<FolderOrigin>) : List<Folder> {
        var folderTranslaters : MutableList<Folder> = mutableListOf()
        for (i in originList) {
            var folderTranslater: Folder = Folder()
            folderTranslater.folderId.set(originList.indexOf(i).toString())
            folderTranslater.folderName.set(i.folderName)
            folderTranslater.todoCount.set("0")
            folderTranslaters.add(folderTranslater)
        }
        return folderTranslaters
    }

    fun translaterTask(originList: List<Task>) : List<TaskModel> {
        var taskTranslater: MutableList<TaskModel> = mutableListOf()
        for (i in originList) {
            var taskModel: TaskModel = TaskModel()
            taskModel.taskId.set(i.taskId.toString())
            taskModel.taskName.set(i.taskName)
            taskModel.duaDate.set(i.duaDate.toString())
            taskModel.isDone.set(i.isDone)
            taskTranslater.add(taskModel)
        }
        return taskTranslater
    }
}