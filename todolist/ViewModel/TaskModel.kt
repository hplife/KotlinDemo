package com.example.thanhchungnguyen.todolist.ViewModel

import android.databinding.ObservableField

class TaskModel {
    var taskId: ObservableField<String> = ObservableField()
    var taskName: ObservableField<String> = ObservableField()
    var duaDate: ObservableField<String> = ObservableField()
    var isDone: ObservableField<Boolean> = ObservableField()
}