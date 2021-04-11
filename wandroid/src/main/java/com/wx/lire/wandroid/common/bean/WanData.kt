package com.wx.lire.wandroid.common.bean

/**
 * author: DomeOfHeaven
 * date : 2021/4/11
 * desc :
 */
data class WanData<T>(
    val `data`: List<T>,
    val errorCode: Int,
    val errorMsg: String
)
