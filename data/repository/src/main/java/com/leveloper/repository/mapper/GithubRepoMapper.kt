package com.leveloper.repository.mapper

import com.leveloper.api.response.GithubRepoRes
import com.leveloper.model.data.GithubRepo

fun GithubRepoRes.toModel(): GithubRepo {
    return GithubRepo(name, id, date, url)
}