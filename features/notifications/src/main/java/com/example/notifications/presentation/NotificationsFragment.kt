package com.example.notifications.presentation

import android.os.Bundle
import com.example.notifications.R
import com.example.notifications.databinding.FragmentNotificationsBinding
import com.multimodulenavigationwithdagger.core.plugins.viewbinding.viewBinding
import com.multimodulenavigationwithdagger.core.presentation.base.BaseFragment

class NotificationsFragment : BaseFragment(R.layout.fragment_notifications) {

    private val binding by viewBinding(FragmentNotificationsBinding::bind)
    private val viewModel: NotificationsViewModel by settingsViewModels()

    override fun callOperations() = Unit
    override fun onSetupLayout(savedInstanceState: Bundle?) = Unit

    override fun onBindViewModel() = with(viewModel) {
        text.observe {
            it.apply(binding.textNotifications)
        }
    }
}