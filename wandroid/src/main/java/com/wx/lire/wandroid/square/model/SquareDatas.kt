package com.wx.lire.wandroid.square.model

import com.wx.lire.wandroid.home.model.PageData

/**
 * author: DomeOfHeaven
 * date : 2021/2/9
 * desc :
 */
data class SquareDatas(
    val `data`: PageData,
    val errorCode: Int,
    val errorMsg: String
)

data class ShareDatas(
    val `data`: Data,
    val errorCode: Int,
    val errorMsg: String
)

data class Data(
    val coinInfo: CoinInfo,
    val shareArticles: SquareDatas
)

data class CoinInfo(
    val coinCount: Int,
    val level: Int,
    val nickname: String,
    val rank: String,
    val userId: Int,
    val username: String
)

