package com.example.notifications.di

import androidx.lifecycle.ViewModel
import com.example.notifications.presentation.NotificationsViewModel
import com.multimodulenavigationwithdagger.core.di.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class NotificationsViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel::class)
    abstract fun notificationsViewModel(viewModel: NotificationsViewModel): ViewModel
}