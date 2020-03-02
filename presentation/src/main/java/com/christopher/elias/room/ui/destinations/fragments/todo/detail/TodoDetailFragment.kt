package com.christopher.elias.room.ui.destinations.fragments.todo.detail

import android.os.Bundle
import android.view.View
import com.christopher.elias.room.BR
import com.christopher.elias.room.R
import com.christopher.elias.room.databinding.FragmentTodoDetailBinding
import com.christopher.elias.room.model.TodoModel
import com.christopher.elias.room.ui.base.BaseFragment

/**
 * Created by Christopher Elias on 3/02/2020.
 * christopher.mike.96@gmail.com
 *
 * Peru Apps
 * Lima, Peru.
 **/
class TodoDetailFragment : BaseFragment<FragmentTodoDetailBinding, TodoDetailViewModel>(TodoDetailViewModel::class) {

    override val getBindingVariable: Int
        get() = BR.todoDetailViewModel

    override val getLayoutId: Int
        get() = R.layout.fragment_todo_detail

    companion object {
        fun newInstance(model: TodoModel) = TodoDetailFragment().apply {
            arguments = Bundle().apply {
                putParcelable("todoModel", model)
            }
        }
    }

    override fun onFragmentViewReady(view: View) {
        myViewModel.getValuesFromArguments(arguments?.getParcelable("todoModel"))
    }
}