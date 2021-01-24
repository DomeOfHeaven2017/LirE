package com.wx.lire.wandroid.data.remote

import com.wx.lire.libcmm.network.GenericResponse
import com.wx.lire.wandroid.bean.*
import retrofit2.http.*

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */

/**
 * WanAndroid Google仓库API
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

/**
 * 公众号API
 */
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

/**
 * 体系数据API
 */
interface SystemApi {

    /**
     * 获取体系数据
     */
    @GET("tree/json")
    suspend fun getSystemData(): GenericResponse<SystemData>

    /**
     * 获取某个知识体系下的文章
     * @param cid 分类Id
     * @param page 页码，从0开始
     */
    @GET("article/list/{page}/json")
    suspend fun searchArticleInSystem(@Path("page") page: Int,@Query("cid") cid: String): GenericResponse<SystemArticles>
}

/**
 * 导航数据API
 */
interface NaviApi {
    /**
     * 获取导航数据
     */
    @GET("navi/json")
    suspend fun getNaviData(): GenericResponse<NaviData>
}

/**
 * 项目数据API
 */
interface ProjectApi {
    /**
     * 获取项目分类信息
     */
    @GET("")
    suspend fun getProjectCategories(): GenericResponse<ProjectData>
    /**
     * 获取某个分类下的文章列表数据
     *  @param cid 项目分类
     *  @param page 从1开始
     */
    @GET("project/list/{page}/json")
    suspend fun searchArticleInProject(@Path("page") page: Int, @Query("cid") cid: String):GenericResponse<ProjectArticles>
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
