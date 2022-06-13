package com.example.home.di

import com.example.home.presentation.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentModule {
    @ContributesAndroidInjector
    abstract fun provideHomeFragment(): HomeFragment
}