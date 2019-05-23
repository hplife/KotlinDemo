package com.example.thanhchungnguyen.todolist.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.thanhchungnguyen.todolist.R
import com.example.thanhchungnguyen.todolist.ViewModel.Folder
import com.example.thanhchungnguyen.todolist.ViewModel.OnClickHandler

class FolderListFragment:BaseFragment() {

    lateinit var onClickHandler: OnClickHandler
    lateinit var listFolder: List<Folder>

    companion object {
        fun createInstance(handler: OnClickHandler) : FolderListFragment {
            val folderListFragment = FolderListFragment()
            folderListFragment.onClickHandler = handler
            return folderListFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listFolder = todoPresenter.getFolderList()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val r = inflater.inflate(R.layout.folder_list_fragment, container, false)
        return r
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listView = view.findViewById<ListView>(R.id.folder_list)
        if (context != null) {
            listView.adapter = FolderListAdapter(this.context!!,listFolder , onClickHandler)
        }
    }
}