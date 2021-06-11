package com.leveloper.api.internal

import com.leveloper.api.response.GithubRepoRes
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("user/{owner}/repos")
    suspend fun getRepos(@Path("owner") owner: String): List<GithubRepoRes>
}
