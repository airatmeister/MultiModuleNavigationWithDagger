package com.example.dashboard.presentation

import android.os.Bundle
import android.view.View
import com.example.dashboard.NavAction
import com.example.dashboard.R
import com.example.dashboard.databinding.FragmentDashboardBinding
import com.multimodulenavigationwithdagger.core.plugins.viewbinding.viewBinding
import com.multimodulenavigationwithdagger.core.presentation.UiAction
import com.multimodulenavigationwithdagger.core.presentation.base.BaseFragment

class DashboardFragment : BaseFragment(R.layout.fragment_dashboard) {

    private val binding by viewBinding(FragmentDashboardBinding::bind)
    private val viewModel: DashboardViewModel by settingsViewModels()

    override fun callOperations() = Unit
    override fun onSetupLayout(savedInstanceState: Bundle?) = with(binding){
        val btnOnClick: (View) -> Unit = {
            navigator.navigateTo(UiAction(NavAction.NAVIGATIONS_FEATURE))
        }
        btnNotificationsFeature.setOnClickListener(btnOnClick)
    }

    override fun onBindViewModel() = with(viewModel) {
        text.observe {
            binding.textDashboard.text = it
        }
    }
}