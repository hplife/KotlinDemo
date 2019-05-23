package com.example.thanhchungnguyen.todolist.View

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.thanhchungnguyen.todolist.ViewModel.OnTaskStatusChange
import com.example.thanhchungnguyen.todolist.ViewModel.TaskModel
import com.example.thanhchungnguyen.todolist.databinding.TodoLayoutBinding

class TodoListAdapter (context: Context,val todoList: List<TaskModel>): BaseAdapter(), OnTaskStatusChange {

    var inflater : LayoutInflater
    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, contentView: View?, viewGroup: ViewGroup?): View? {
        var binding: TodoLayoutBinding?
        if (contentView == null) {
            binding = TodoLayoutBinding.inflate(inflater, viewGroup, false)
            binding.root.tag = binding
        } else {
            binding = contentView.tag as TodoLayoutBinding
        }
        binding?.task = getItem(position) as TaskModel
        binding?.handler = this
        return binding?.root
    }

    override fun getItem(index: Int): Any {
        return todoList[index]
    }

    override fun getItemId(id: Int): Long {
        return todoList[id].taskId.get()!!.toLong()
    }

    override fun getCount(): Int {
        return todoList.size
    }

    override fun onCheckedChanged(task: TaskModel ) {
        var isChecked = task.isDone.get() ?: false
        task.isDone.set(!isChecked)
    }
}