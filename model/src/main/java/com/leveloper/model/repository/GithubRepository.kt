package com.leveloper.model.repository

import com.leveloper.model.data.GithubRepo
import kotlinx.coroutines.flow.Flow

interface GithubRepository {
    suspend fun getRepos(owner: String): Flow<List<GithubRepo>>
}