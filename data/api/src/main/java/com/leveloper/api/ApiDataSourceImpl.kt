package com.leveloper.api

import com.leveloper.api.response.GithubRepoRes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiDataSourceImpl @Inject constructor(
    private val githubService: GithubService
) : ApiDataSource {

    override suspend fun getRepos(owner: String): Flow<List<GithubRepoRes>> = flow {

        githubService.getRepos(owner)
        emit(emptyList())
//        emit(githubService.getRepos(owner))
    }
}