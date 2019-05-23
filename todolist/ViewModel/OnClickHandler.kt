package com.example.thanhchungnguyen.todolist.ViewModel

import android.databinding.BindingMethod
import android.view.View
import android.widget.CheckBox

interface OnClickHandler {
    fun folderOnClickHandler(folder: Folder)
}
interface OnTaskStatusChange {
    fun onCheckedChanged(task: TaskModel)
}