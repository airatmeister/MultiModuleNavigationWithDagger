package com.example.home.di

import dagger.Module

@Module(includes = [
    HomeFragmentModule::class,
    HomeViewModelModule::class
])
abstract class HomeModuleProvider