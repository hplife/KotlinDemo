package com.example.thanhchungnguyen.todolist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.thanhchungnguyen.todolist.View.FolderListFragment
import com.example.thanhchungnguyen.todolist.View.TodoListFragment
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.OnClickHandler

class MainActivity : AppCompatActivity(), OnClickHandler {

    override fun folderOnClickHandler(folder: Folder) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.folder_view, TodoListFragment.createInstance())
        transaction.addToBackStack("todo")
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.folder_view, FolderListFragment.createInstance(this))
            transaction.addToBackStack("folder")
            transaction.commit()
        }
    }
}
