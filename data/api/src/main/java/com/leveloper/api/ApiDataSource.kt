package com.leveloper.api

import com.leveloper.api.response.GithubRepoRes
import kotlinx.coroutines.flow.Flow

interface ApiDataSource {
    suspend fun getRepos(owner: String): Flow<List<GithubRepoRes>>
}