package com.wx.lire.wandroid.home.model

import com.wx.lire.wandroid.common.bean.ArticleItem

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */
data class HomeDatas(
    val `data`: PageData,
    val errorCode: Int,
    val errorMsg: String
)

data class PageData(
    val curPage: Int,
    val datas: List<ArticleItem>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)

data class FriendLink(
    val category: String,
    val icon: String,
    val id: Int,
    val link: String,
    val name: String,
    val order: Int,
    val visible: Int
)

data class HotKey(
    val id: Int,
    val link: String,
    val name: String,
    val order: Int,
    val visible: Int
)




