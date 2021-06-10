package com.leveloper.api.response

import com.google.gson.annotations.SerializedName

data class GithubRepoRes(
    @SerializedName("name")
    val name: String,

    @SerializedName("id")
    val id: Long,

    @SerializedName("created_at")
    val date: String,

    @SerializedName("html_url")
    val url: String
)