package com.example.dashboard.di

import androidx.lifecycle.ViewModel
import com.example.dashboard.presentation.DashboardViewModel
import com.multimodulenavigationwithdagger.core.di.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DashboardViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun dashboardViewModel(viewModel: DashboardViewModel): ViewModel
}