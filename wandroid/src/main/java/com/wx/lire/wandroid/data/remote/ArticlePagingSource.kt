package com.wx.lire.wandroid.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.wx.lire.wandroid.common.bean.ArticleItem

/**
 * author: DomeOfHeaven
 * date : 2021/3/28
 * desc :
 */
class ArticlePagingSource(private val ) : PagingSource<Int, ArticleItem>(){
    override fun getRefreshKey(state: PagingState<Int, ArticleItem>): Int? = null

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ArticleItem> {
        return try {
            val page = params.key ?: 1
            val pageSize = params.loadSize
            val prevKey = if (page > 1) page - 1 else null
            val nextKey = if ()
             LoadResult.Page(, prevKey, nextKey)
            return null
        } catch (ex : Exception) {
            LoadResult.Error(ex)
        }
    }
}