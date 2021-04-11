package com.wx.lire.wandroid.wechat.model

import com.wx.lire.wandroid.common.bean.ChapterDatas
import com.wx.lire.wandroid.bean.Chapters
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
 * 公众号API
 */
interface ChapterApi {
    /**
     * 获取公众号列表
     */
    @GET("wxarticle/chapters/json")
    suspend fun getChapters(): GenericResponse<WanData<Chapters>>
    /**
     * 查看某个公众号历史数据
     * chapterId : 公众号 ID
     *  page : 公众号页码
     */
    @GET("wxarticle/list/{chapterId}/{page}/json")
    suspend fun getChapterById(@Path("chapterId") chapterId: String, @Path("page") page: Int): GenericResponse<ChapterDatas>
    /**
     *  在某个公众号中搜索历史文章
     *  key: 查询词
     * chapterId : 公众号 ID
     *  page : 公众号页码
     */
    @GET("wxarticle/list/{chapterId}/{page}/json")
    suspend fun searchArticleInChapter(@Query("k") k: String, @Path("chapterId") chapterId: String, @Path("page") page: Int): GenericResponse<ChapterDatas>
}