package com.wx.lire.libcmm.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 *Created by wx on 19-7-8
 *Description : Activity基类
 */
abstract class BaseActivity(@LayoutRes resId: Int) : AppCompatActivity(resId), IVIewInit {

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        initBefore()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        setupData()
    }

    override fun onDestroy() {
        super.onDestroy()
        exitView()
    }
}
