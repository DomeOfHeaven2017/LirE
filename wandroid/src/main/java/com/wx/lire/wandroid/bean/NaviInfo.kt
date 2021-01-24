package com.wx.lire.wandroid.bean

/**
 * author: DomeOfHeaven
 * date : 2021/1/17
 * desc :
 */

data class NaviData(
    val `data`: List<NaviItem>,
    val errorCode: Int,
    val errorMsg: String
)

data class NaviItem(
    val articles: List<ArticleItem>,
    val cid: Int,
    val name: String
)