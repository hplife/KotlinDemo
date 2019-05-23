package com.example.thanhchungnguyen.todolist.View

import android.support.v4.app.Fragment
import com.example.thanhchungnguyen.todolist.Presenter.TodoPresenter

open class BaseFragment: Fragment() {
    protected var todoPresenter = TodoPresenter()
}