package com.wx.lire.wandroid.bean

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */
data class BannerDatas(
    val `data`: List<BannerData>,
    val errorCode: Int,
    val errorMsg: String
)

data class BannerData(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)