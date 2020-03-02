package com.christopher.elias.room.ui.destinations.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.christopher.elias.room.R
import com.christopher.elias.room.ui.destinations.fragments.todo.list.TodoListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_main, TodoListFragment())
            .commit()
    }
}
