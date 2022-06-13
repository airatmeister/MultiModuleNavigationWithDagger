package com.example.dashboard.di

import com.example.dashboard.presentation.DashboardFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DashboardFragmentModule {
    @ContributesAndroidInjector
    abstract fun provideDashboardFragment(): DashboardFragment
}