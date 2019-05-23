package com.example.thanhchungnguyen.todolist.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.thanhchungnguyen.todolist.R
import com.example.thanhchungnguyen.todolist.ViewModel.TaskModel

class TodoListFragment: BaseFragment() {

    lateinit var taskList: List<TaskModel>

    companion object {
        fun createInstance() : TodoListFragment {
            val todoListFragment = TodoListFragment()
            return todoListFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskList = todoPresenter.getTaskList()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val r = inflater.inflate(R.layout.todo_list_fragment, container, false)
        return r
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listView = view.findViewById<ListView>(R.id.todo_list)
        if (context != null) {
            listView.adapter = TodoListAdapter(context!!,taskList)
        }
    }
}