package com.wx.lire.wandroid.debug

import com.wx.lire.wandroid.R
import com.wx.lire.wandroid.MainFragment
import com.wx.repos.base.view.BaseActivity

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