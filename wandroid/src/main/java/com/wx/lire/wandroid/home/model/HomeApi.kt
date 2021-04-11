package com.wx.lire.wandroid.home.model

import com.wx.lire.wandroid.common.bean.WanData
import com.wx.repos.base.network.GenericResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * author: DomeOfHeaven
 * date : 2021/4/5
 * desc :
 */
/**
 * 首页数据API
 */
interface HomeApi {
    /**
     * 获取首页文章列表
     * @param page 页码，从0开始
     */
    @GET("article/list/{page}/json")
    suspend fun getHomeArticles(@Path("page") page: Int): GenericResponse<HomeDatas>
    /**
     * 获取首页banner数据
     */
    @GET("banner/json")
    suspend fun getBannerData(): GenericResponse<WanData<BannerData>>
    /**
     * 获取常用网站
     */
    @GET("friend/json")
    suspend fun getFriendLinks(): GenericResponse<WanData<FriendLink>>
    /**
     * 获取搜索热词
     */
    @GET("hotkey/json")
    suspend fun getHotKeys(): GenericResponse<WanData<HotKey>>
}