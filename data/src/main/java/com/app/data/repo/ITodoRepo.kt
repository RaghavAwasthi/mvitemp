package com.app.data.repo

import com.app.data.entity.TODOEntity

interface ITodoRepo {
    suspend fun getTodos(): List<TODOEntity>
}