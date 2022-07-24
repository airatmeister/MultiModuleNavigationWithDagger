package com.multimodulenavigationwithdagger.core.presentation

import androidx.navigation.NavController

interface Navigator {
    fun getNavController(): NavController
    fun navigateTo(action: UiAction)
}