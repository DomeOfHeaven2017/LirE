package com.wx.lire.wandroid.square.model

import com.wx.repos.base.network.GenericResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * author: DomeOfHeaven
 * date : 2021/4/5
 * desc :
 */

/**
 * 获取广场数据API
 */
interface SquareApi {

    /**
     * 获取广场列表数据
     * page 页码
     */
    @GET("user_article/list/{page}/json")
    suspend fun getSquareArticles(@Path("page") page: Int): GenericResponse<SquareDatas>

    /**
     * 获取某个用户的分享内容
     * id 用户id
     * page 页码
     */
    @GET("user/{id}/share_articles/{page}/json")
    suspend fun getArticlesByUser(@Path("id") id: Int, @Path("page") page: Int ): GenericResponse<ShareDatas>
}
