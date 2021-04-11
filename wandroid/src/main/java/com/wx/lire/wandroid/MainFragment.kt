package com.wx.lire.wandroid

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wx.repos.base.view.BaseFragment

/**
 * author: DomeOfHeaven
 * date : 2021/1/10
 * desc : 主界面
 */
class MainFragment: BaseFragment(R.layout.wandroid_fragment_main) {
    override fun initBefore() {

    }

    override fun setupView() {
        val naviHost = childFragmentManager.findFragmentById(R.id.container_parent_wandroid_fragment_main) as NavHostFragment
        view?.apply {
            val naviController = naviHost.findNavController()
            findViewById<BottomNavigationView>(R.id.navi_bottom_wanandroid_fragment_main)?.setupWithNavController(naviController)
        }
    }

    override fun setupData() {

    }

    override fun exitView() {

    }
}