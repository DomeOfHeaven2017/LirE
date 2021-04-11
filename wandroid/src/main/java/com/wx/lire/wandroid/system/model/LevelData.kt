package com.wx.lire.wandroid.system.model

/**
 * author: DomeOfHeaven
 * date : 2021/1/17
 * desc :
 */
data class LevelData(
    val children: List<LevelData>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)