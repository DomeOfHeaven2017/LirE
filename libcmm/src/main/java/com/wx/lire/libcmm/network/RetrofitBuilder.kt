package com.wx.lire.libcmm.network

import com.wx.lire.libcmm.common.Constants
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * author: DomeOfHeaven
 * date : 2021/1/9
 * desc :Retrofit builder
 */
object RetrofitBuilder {

    fun build(
        url: String,
        callAdapter: CallAdapter.Factory = NetResponseAdapterFactory(),
        converter: Converter.Factory = MoshiConverterFactory.create(),
        connectTime: Long = Constants.HTTP_CONNECT_TIME_OUT,
        readTime: Long = Constants.HTTP_READ_TIME_OUT,
        maxConnects: Int = Constants.HTTP_CONNECTION_POOL,
        aliveDuration: Long = Constants.HTTP_ALIVE_DURATION,
        timeUnit: TimeUnit = TimeUnit.SECONDS
    ): Retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addCallAdapterFactory(callAdapter)
        .addConverterFactory(converter)
        .client(
            OkHttpClient.Builder()
                .connectTimeout(connectTime, timeUnit)
                .readTimeout(readTime, timeUnit)
                .connectionPool(ConnectionPool(maxConnects, aliveDuration, timeUnit))
                .build()
        )
        .build()
}