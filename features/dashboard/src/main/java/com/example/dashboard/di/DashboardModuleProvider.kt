package com.example.dashboard.di

import dagger.Module

@Module(includes = [
    DashboardFragmentModule::class,
    DashboardViewModelModule::class
])
abstract class DashboardModuleProvider