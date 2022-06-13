package com.example.notifications.di

import com.example.notifications.presentation.NotificationsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NotificationsFragmentModule {
    @ContributesAndroidInjector
    abstract fun provideNotificationsFragment(): NotificationsFragment
}