package com.wx.lire.wandroid.bean

/**
 * author: DomeOfHeaven
 * date : 2021/1/17
 * desc :
 */

data class SystemData(
    val `data`: List<PrimaryLevel>,
    val errorCode: Int,
    val errorMsg: String
)

data class PrimaryLevel(
    val children: List<SubLevel>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)

data class SubLevel(
    val children: List<Any>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)

data class SystemArticles(
    val curPage: Int,
    val datas: List<ArticleItem>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)