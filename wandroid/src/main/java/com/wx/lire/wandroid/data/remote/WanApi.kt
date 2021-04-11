package com.wx.lire.wandroid.data.remote

import com.wx.lire.wandroid.bean.*
import com.wx.lire.wandroid.common.bean.NaviItem
import com.wx.lire.wandroid.common.bean.WanData
import com.wx.repos.base.network.GenericResponse
import retrofit2.http.*

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */


/**
 * 导航数据API
 */
interface NaviApi {
    /**
     * 获取导航数据
     */
    @GET("navi/json")
    suspend fun getNaviData(): GenericResponse<WanData<NaviItem>>
}



/**
 * 用户数据API
 */
interface UserApi {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * 登录后会在cookie中返回账号密码，只要在客户端做cookie持久化存储即可自动登录验证。
     */
    @POST("user/login")
    suspend fun loginWanAndroid()

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @param repassword 重复密码
     */
    @POST("user/register")
    suspend fun registerWanAndroid()

    /**
     * 退出登录
     * 访问了 logout 后，服务端会让客户端清除 Cookie（即cookie max-Age=0），如果客户端 Cookie 实现合理，可以实现自动清理，如果本地做了用户账号密码和保存，及时清理。
     */
    @GET("user/logout/json")
    suspend fun logoutWanAndroid()

    /** 所有收藏相关都需要登录操作，建议登录将返回的cookie（其中包含账号、密码）持久化到本地即可。  **/
    /**
     * 获取收藏文章列表
     * @param page 页码，从1开始
     */
    @GET("lg/collect/list/{page}/json")
    suspend fun getCollectArticle(@Path("page") page: Int)

    /**
     * 收藏站内文章
     * @param id 文章id
     */
    @POST("lg/collect/{id}/json")
    suspend fun collectInternalArticle(@Field("id") id: String)
}
