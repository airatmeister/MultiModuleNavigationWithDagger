package com.multimodulenavigationwithdagger.presentation

import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.multimodulenavigationwithdagger.R
import com.multimodulenavigationwithdagger.core.presentation.UiAction
import com.multimodulenavigationwithdagger.core.presentation.base.BaseActivity
import com.multimodulenavigationwithdagger.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initVB() = ActivityMainBinding.inflate(layoutInflater)

    override fun getNavController() = findNavController(R.id.nav_host_fragment_activity_main)

    override fun navigateTo(action: UiAction) {
        when (action.id){
            "dashboard_feature" -> navigator.navigate(R.id.navigation_dashboard)
            "home_feature" -> navigator.navigate(R.id.navigation_home)
            "notifications_feature" -> navigator.navigate(R.id.navigation_notifications)
        }
    }

    override fun onSetupLayout() {
        setupActionBarWithNavController(navigator, AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications
            )
        ))
        binding.navView.setupWithNavController(navigator)
    }
}