package com.leveloper.repository.internal.mapper

import com.leveloper.api.response.GithubRepoRes
import com.leveloper.model.data.GithubRepo

internal fun GithubRepoRes.toModel(): GithubRepo {
    return GithubRepo(name, id.toString(), date, url)
}