package com.wx.lire.wandroid.bean

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