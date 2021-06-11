package com.leveloper.repository.internal.impl

import com.leveloper.api.ApiDataSource
import com.leveloper.db.LocalDataSource
import com.leveloper.model.data.GithubRepo
import com.leveloper.model.repository.GithubRepository
import com.leveloper.repository.internal.mapper.toModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class GithubRepositoryImpl @Inject constructor(
    private val apiDataSource: ApiDataSource,
    private val localDataSource: LocalDataSource
) : GithubRepository {

    override suspend fun getRepos(owner: String): Flow<List<GithubRepo>> {
        println(apiDataSource)
        return apiDataSource.getRepos(owner).map { list ->
            list.map { it.toModel() }
        }
    }


}