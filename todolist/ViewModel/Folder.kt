package com.example.thanhchungnguyen.todolist.ViewModel

import android.databinding.ObservableField

class Folder {
    var folderId: ObservableField<String> = ObservableField<String>()
    var folderName : ObservableField<String> = ObservableField<String>()
    var todoCount : ObservableField<String> = ObservableField<String>()
}