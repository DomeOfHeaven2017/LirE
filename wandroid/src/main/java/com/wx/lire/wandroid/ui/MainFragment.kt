package com.wx.lire.wandroid.ui

import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wx.lire.libcmm.view.BaseFragment
import com.wx.lire.wandroid.R

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