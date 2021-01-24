package com.wx.lire.wandroid.bean

/**
 * author: DomeOfHeaven
 * date : 2021/1/17
 * desc :
 */

data class ProjectData(
    val `data`: List<ProjectItem>,
    val errorCode: Int,
    val errorMsg: String
)

data class ProjectItem(
    val children: List<Any>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)

data class ProjectArticles(
    val `data`: ProjectArticle,
    val errorCode: Int,
    val errorMsg: String
)

data class ProjectArticle(
    val curPage: Int,
    val datas: List<ArticleItem>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)