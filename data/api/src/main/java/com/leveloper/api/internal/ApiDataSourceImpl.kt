package com.leveloper.api.internal

import com.leveloper.api.ApiDataSource
import com.leveloper.api.response.GithubRepoRes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class ApiDataSourceImpl @Inject constructor(
    private val githubService: GithubService
) : ApiDataSource {

    override suspend fun getRepos(owner: String): Flow<List<GithubRepoRes>> {
        val abc = githubService.getRepos(owner)
//        println("size: ${abc.size}")
        return flow {  }
    }

//    override suspend fun getRepos(owner: String): Flow<List<GithubRepoRes>> = flow {
//        val abc = githubService.getRepos(owner)
//        println("abc size: ${abc}")
//        emit(abc)
//    }
}