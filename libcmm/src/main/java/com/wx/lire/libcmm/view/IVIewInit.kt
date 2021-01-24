package com.wx.lire.libcmm.view

/**
 *Created by wx on 19-7-8
 *Description :
 */
interface IVIewInit {
    /**
     * 在View前的初始化
     */
    fun initBefore() : Unit
    /**
     * 初始化View,绑定控件
     */
    fun setupView() : Unit
    /**
     * 初始化数据
     */
    fun setupData() : Unit
    /**
     * release resource
     */
    fun exitView(): Unit
}