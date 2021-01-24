package com.wx.lire.wandroid.debug

import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.wx.lire.libcmm.view.BaseActivity
import com.wx.lire.wandroid.R
import com.wx.lire.wandroid.ui.MainFragment

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc :
 */
class DebugActivity : BaseActivity(R.layout.wandroid_activity_debug_main){
    override fun initBefore() {

    }

    override fun setupView() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container_root_wandroid_activity_debug, MainFragment())
            .commit()
    }

    override fun setupData() {
    }

    override fun exitView() {
    }
}