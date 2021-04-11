package com.wx.lire.wandroid.repo.model

import com.wx.lire.wandroid.bean.*
import com.wx.lire.wandroid.common.bean.WanData
import com.wx.repos.base.network.GenericResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * author: DomeOfHeaven
 * date : 2021/4/5
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
    suspend fun getAllGoogleMavenRepos(): GenericResponse<WanData<String>>

    /**
     * 查询某个包名信息
     * k :查询词
     */
    @GET("maven_pom/search/json")
    suspend fun searchGoogleMavenRepo(@Query("k") k: String): GenericResponse<WanData<RepoList>>

}