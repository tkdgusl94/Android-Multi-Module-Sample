package com.leveloper.repository.impl

import com.leveloper.api.ApiDataSource
import com.leveloper.model.data.GithubRepo
import com.leveloper.model.repository.GithubRepository
import com.leveloper.repository.mapper.toModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val apiDataSource: ApiDataSource
) : GithubRepository {

    override suspend fun getRepos(owner: String): Flow<List<GithubRepo>> {
        return apiDataSource.getRepos(owner).map { list ->
            list.map { it.toModel() }
        }
    }
}