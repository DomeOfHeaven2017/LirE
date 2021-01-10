package com.wx.lire.wandroid.bean

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */
data class HomeDatas(
    val `data`: HomeData,
    val errorCode: Int,
    val errorMsg: String
)

data class HomeData(
    val curPage: Int,
    val datas: List<ArticleItem>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)

data class FriendLinks(
    val `data`: List<FriendLink>,
    val errorCode: Int,
    val errorMsg: String
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

data class HotKeys(
    val `data`: List<HotKey>,
    val errorCode: Int,
    val errorMsg: String
)

data class HotKey(
    val id: Int,
    val link: String,
    val name: String,
    val order: Int,
    val visible: Int
)




