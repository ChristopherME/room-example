package com.christopher.elias.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.christopher.elias.data.local.entity.TodoLocalEntity


/**
 * Created by Christopher Elias on 2020-03-01.
 * christopher.mike.96@gmail.com
 *
 * Lima, Peru.
 **/

@Dao
interface TodoLocalDao {

    @Query("SELECT * FROM todo_table")
    suspend fun getAll() : List<TodoLocalEntity>

    @Query("SELECT * FROM todo_table WHERE id=:id")
    suspend fun get(id: Int): TodoLocalEntity
}