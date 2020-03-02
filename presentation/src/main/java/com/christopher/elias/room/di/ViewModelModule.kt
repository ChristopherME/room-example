package com.christopher.elias.room.di

import com.christopher.elias.room.ui.destinations.fragments.todo.detail.TodoDetailViewModel
import com.christopher.elias.room.ui.destinations.fragments.todo.list.TodoListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Christopher Elias on 3/02/2020.
 * christopher.mike.96@gmail.com
 *
 * Peru Apps
 * Lima, Peru.
 **/

val viewModelModule = module {
    viewModel { TodoListViewModel(get(), get()) }
    viewModel { TodoDetailViewModel(get(), get()) }
}