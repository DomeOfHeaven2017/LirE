package com.wx.lire.wandroid.bean

data class GoogleRepos(
    val `data`: List<String>,
    val errorCode: Int,
    val errorMsg: String
)

data class GoogleRepo(
    val `data`: List<RepoList>,
    val errorCode: Int,
    val errorMsg: String
)

data class RepoList(
    val artifactMap: ArtifactMap,
    val groupName: String
)

data class ArtifactMap(
    val viewpager2: List<RepoItem>
)

data class RepoItem(
    val artifact: String,
    val content: String,
    val date: Any,
    val group: String,
    val id: Int,
    val version: String
)