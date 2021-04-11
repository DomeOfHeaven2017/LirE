package com.wx.lire.wandroid.common.bean

import com.wx.lire.wandroid.home.model.PageData

data class Chapter(
    val children: List<Any>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)

data class ChapterDatas(
    val `data`: PageData,
    val errorCode: Int,
    val errorMsg: String
)