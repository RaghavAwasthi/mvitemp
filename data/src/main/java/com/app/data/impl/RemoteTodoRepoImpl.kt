package com.app.data.impl

import com.app.data.entity.TODOEntity
import com.app.data.repo.ITodoRepo

class RemoteTodoRepoImpl:ITodoRepo {
    override suspend fun getTodos(): List<TODOEntity> {
        return listOf(TODOEntity("abe","Tesefewft"),TODOEntity("creged","Test2"))

    }
}