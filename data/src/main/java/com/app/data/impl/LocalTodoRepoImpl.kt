package com.app.data.impl

import com.app.data.entity.TODOEntity
import com.app.data.repo.ITodoRepo

class LocalTodoRepoImpl:ITodoRepo {
    override suspend fun getTodos(): List<TODOEntity> {
        return listOf(TODOEntity("ab","Test"),TODOEntity("cd","Test2"))
    }
}