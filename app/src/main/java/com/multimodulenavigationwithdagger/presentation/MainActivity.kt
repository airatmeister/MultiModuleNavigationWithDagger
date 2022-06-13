package com.multimodulenavigationwithdagger.presentation

import androidx.navigation.NavAction
import androidx.navigation.NavController
import com.google.android.material.bottomnavigation.BottomNavigationView
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
        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }
}