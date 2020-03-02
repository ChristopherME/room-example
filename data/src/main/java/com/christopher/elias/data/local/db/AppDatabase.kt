package com.christopher.elias.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.christopher.elias.data.local.dao.TodoLocalDao
import com.christopher.elias.data.local.entity.TodoLocalEntity


/**
 * Created by Christopher Elias on 2020-03-01.
 * christopher.mike.96@gmail.com
 *
 * Lima, Peru.
 **/
@Database(entities = arrayOf(TodoLocalEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao() : TodoLocalDao
}