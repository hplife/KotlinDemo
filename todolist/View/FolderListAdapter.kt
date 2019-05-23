package com.example.thanhchungnguyen.todolist.View

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.OnClickHandler
import com.example.thanhchungnguyen.todolist.databinding.FolderLayoutBinding

class FolderListAdapter (context: Context,val folders: List<Folder>, handler: OnClickHandler): BaseAdapter() {

    var inflater : LayoutInflater
    var onClickHandler: OnClickHandler
    init {
        inflater = LayoutInflater.from(context)
        onClickHandler = handler
    }


    override fun getView(position: Int, contentView: View?, viewGroup: ViewGroup?): View? {
        var binding: FolderLayoutBinding?
        if (contentView == null) {
            binding = FolderLayoutBinding.inflate(inflater,viewGroup,false)
            binding.root.tag = binding
        } else {
            binding = contentView.tag as FolderLayoutBinding
        }
        binding?.folder = getItem(position) as Folder
        binding?.handler = onClickHandler
        return binding?.root
    }

    override fun getItem(index: Int): Any {
        return folders[index]
    }

    override fun getItemId(id: Int): Long {
        return folders[id].folderId.get()!!.toLong()
    }

    override fun getCount(): Int {
        return folders.size
    }
}