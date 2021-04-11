package com.wx.lire.wandroid.project.model


import com.wx.lire.wandroid.common.bean.WanData
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
 * 项目数据API
 */
interface ProjectApi {
    /**
     * 获取项目分类信息
     */
    @GET("")
    suspend fun getProjectCategories(): GenericResponse<WanData<ProjectItem>>
    /**
     * 获取某个分类下的文章列表数据
     *  @param cid 项目分类
     *  @param page 从1开始
     */
    @GET("project/list/{page}/json")
    suspend fun searchArticleInProject(@Path("page") page: Int, @Query("cid") cid: String):GenericResponse<ProjectArticles>
}