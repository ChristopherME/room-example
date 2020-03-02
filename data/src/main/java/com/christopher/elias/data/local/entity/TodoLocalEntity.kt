package com.christopher.elias.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by Christopher Elias on 2020-03-01.
 * christopher.mike.96@gmail.com
 *
 * Lima, Peru.
 **/
@Entity(tableName = "todo_table")
data class TodoLocalEntity(@PrimaryKey val id: Int,
                           val userId: Int,
                           val title: String,
                           val completed: Boolean)