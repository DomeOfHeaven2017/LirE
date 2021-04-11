package com.wx.lire.wandroid.system.model

import com.wx.lire.wandroid.common.bean.WanData
import com.wx.lire.wandroid.home.model.PageData
import com.wx.repos.base.network.GenericResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * author: DomeOfHeaven
 * date : 2021/4/5
 * desc :
 */

/**
 * 体系数据API
 */
interface SystemApi {

    /**
     * 获取体系数据
     */
    @GET("tree/json")
    suspend fun getSystemData(): GenericResponse<WanData<LevelData>>

    /**
     * 获取某个知识体系下的文章
     * @param cid 分类Id
     * @param page 页码，从0开始
     */
    @GET("article/list/{page}/json")
    suspend fun searchArticleInSystem(@Path("page") page: Int, @Query("cid") cid: String): GenericResponse<PageData>
}