package com.wx.lire.libcmm.view

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 *Created by wx on 19-7-8
 *Description : Fragment基类
 */
abstract class BaseFragment(@LayoutRes resId: Int) : Fragment(resId),IVIewInit{

    protected lateinit var mContext : Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
        initBefore()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        setupData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        exitView()
    }




}