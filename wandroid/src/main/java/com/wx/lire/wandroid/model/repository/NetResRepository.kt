package com.wx.lire.wandroid.model.repository

import com.wx.lire.wandroid.common.WanConstants
import com.wx.lire.wandroid.data.remote.*
import com.wx.repos.base.network.RetrofitBuilder
import retrofit2.Retrofit

/**
 * author: DomeOfHeaven
 * date : 2021/2/9
 * desc :
 */
class NetResRepository {

    private val mRetrofit: Retrofit = RetrofitBuilder.build(WanConstants.WANDROID_BASE_URL)

    private val mSquareService  = mRetrofit.create(SquareApi::class.java)

    suspend fun requireSquareData(page: Int)  = mSquareService.getSquareArticles(page)

    suspend fun requireSquareDataWithUser(id: Int, page: Int) = mSquareService.getArticlesByUser(id, page)

    private val mHomeService = mRetrofit.create(HomeApi::class.java)

    suspend fun requireHomeData(page: Int) = mHomeService.getHomeArticles(page)

    suspend fun requireBannerData() = mHomeService.getBannerData()

    suspend fun requireFriendLinks() = mHomeService.getFriendLinks()

    suspend fun requireHotkeys()  = mHomeService.getHotKeys();

    private val mRepoService = mRetrofit.create(RepoApi::class.java)

    suspend fun requireAllRepos() = mRepoService.getAllGoogleMavenRepos()

    suspend fun requireRepoByKey(key: String) = mRepoService.searchGoogleMavenRepo(key)

    private val mChapterService = mRetrofit.create(ChapterApi::class.java)

    suspend fun requireChapters() = mChapterService.getChapters()

    suspend fun requireChapterById(chapterId: String, page: Int) = mChapterService.getChapterById(chapterId, page)

    suspend fun requireArticleInChapter(key: String, chapterId: String, page: Int) = mChapterService.searchArticleInChapter(key, chapterId, page)

    private val mSystemService = mRetrofit.create(SystemApi::class.java)

    suspend fun requireSystemData() = mSystemService.getSystemData()

    suspend fun requireArticleInSystem(page: Int, cid: String) = mSystemService.searchArticleInSystem(page, cid)

    private val mNaviService = mRetrofit.create(NaviApi::class.java)

    suspend fun requireNaviData() = mNaviService.getNaviData()

    private val mProjectService = mRetrofit.create(ProjectApi::class.java)

    suspend fun requireCategroies() = mProjectService.getProjectCategories()

    suspend fun requireArticleInProject(page: Int, cid: String) = mProjectService.searchArticleInProject(page, cid)

    private val mUserService = mRetrofit.create(UserApi::class.java)

    suspend fun loginWanAndroid(name: String, passwd: String) {
    }

}