package com.wx.lire.wandroid.project.model

import com.wx.lire.wandroid.home.model.PageData

/**
 * author: DomeOfHeaven
 * date : 2021/1/17
 * desc :
 */
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
    val `data`: PageData,
    val errorCode: Int,
    val errorMsg: String
)