package com.example.home.di

import androidx.lifecycle.ViewModel
import com.example.home.presentation.HomeViewModel
import com.multimodulenavigationwithdagger.core.di.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun homeViewModel(viewModel: HomeViewModel): ViewModel
}