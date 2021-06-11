package com.leveloper.api.internal

import com.leveloper.api.ApiDataSource
import com.leveloper.api.response.GithubRepoRes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class ApiDataSourceImpl @Inject constructor(
    private val githubService: GithubService
) : ApiDataSource {

    override suspend fun getRepos(owner: String): Flow<List<GithubRepoRes>> = flow {

        githubService
//        githubService.getRepos(owner)
        emit(emptyList())
//        emit(githubService.getRepos(owner))
    }
}