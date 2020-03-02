package com.christopher.elias.room.di

import com.christopher.elias.room.mapper.TodoModelMapper
import com.christopher.elias.room.mapper.TodoModelMapperImpl
import org.koin.dsl.module

/**
 * Created by Christopher Elias on 3/02/2020.
 * christopher.mike.96@gmail.com
 *
 * Peru Apps
 * Lima, Peru.
 **/

val mapperPresentationModule = module {
    single<TodoModelMapper>{ TodoModelMapperImpl() }
}