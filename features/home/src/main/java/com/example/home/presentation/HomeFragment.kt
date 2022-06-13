package com.example.home.presentation

import android.os.Bundle
import android.view.View
import com.example.home.NavAction
import com.example.home.R
import com.example.home.databinding.FragmentHomeBinding
import com.multimodulenavigationwithdagger.core.plugins.viewbinding.viewBinding
import com.multimodulenavigationwithdagger.core.presentation.UiAction
import com.multimodulenavigationwithdagger.core.presentation.base.BaseFragment

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeViewModel by settingsViewModels()

    override fun callOperations() = Unit
    override fun onSetupLayout(savedInstanceState: Bundle?)  = with(binding){
        val btnOnClick: (View) -> Unit = {
            navigator.navigateTo(UiAction(NavAction.NAVIGATIONS_FEATURE))
        }
        btnDashboardFeature.setOnClickListener(btnOnClick)
    }

    override fun onBindViewModel() = with(viewModel) {
        text.observe {
            it.apply(binding.textHome)
        }
    }
}