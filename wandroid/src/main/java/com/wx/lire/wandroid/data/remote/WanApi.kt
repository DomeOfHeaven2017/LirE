package com.wx.lire.wandroid.data.remote

import com.wx.lire.libcmm.network.GenericResponse
import com.wx.lire.wandroid.bean.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */

interface RepoApi {
    /**
     * 获取所有Google Maven 仓库包名
     */
    @GET("maven_pom/package/json")
    suspend fun getAllGoogleMavenRepos(): GenericResponse<GoogleRepos>

    /**
     * 查询某个包名信息
     * k :查询词
     */
    @GET("maven_pom/search/json")
    suspend fun searchGoogleMavenRepo(@Query("k") k: String): GenericResponse<GoogleRepo>

}

interface ChapterApi {
    /**
     * 获取公众号列表
     */
    @GET("wxarticle/chapters/json")
    suspend fun getChapters(): GenericResponse<Chapters>
    /**
     * 查看某个公众号历史数据
     * chapterId : 公众号 ID
     *  page : 公众号页码
     */
    @GET("wxarticle/list/{chapterId}/{page}/json")
    suspend fun getChapterById(@Path("chapterId") chapterId: String,  @Path("page") page: Int): GenericResponse<ChapterDatas>
    /**
     *  在某个公众号中搜索历史文章
     *  key: 查询词
     * chapterId : 公众号 ID
     *  page : 公众号页码
     */
    @GET("wxarticle/list/{chapterId}/{page}/json")
    suspend fun searchArticleInChapter(@Path("chapterId") chapterId: String,  @Path("page") page: Int, @Query("k") k: String): GenericResponse<ChapterDatas>
}

interface HomeApi {
    /**
     * 获取首页文章列表
     *  page: 页码 从0开始
     */
    @GET("article/list/{page}/json")
    suspend fun getHomeArticles(@Path("page") page: Int): GenericResponse<HomeDatas>
    /**
     * 获取首页banner数据
     */
    @GET("banner/json")
    suspend fun getBannerData(): GenericResponse<BannerDatas>
    /**
     * 获取常用网站
     */
    @GET("friend/json")
    suspend fun getFriendLinks(): GenericResponse<FriendLinks>
    /**
     * 获取搜索热词
     */
    @GET("hotkey/json")
    suspend fun getHotKeys(): GenericResponse<HotKeys>
}