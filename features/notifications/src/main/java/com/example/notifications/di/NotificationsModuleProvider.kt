package com.example.notifications.di

import dagger.Module

@Module(includes = [
    NotificationsFragmentModule::class,
    NotificationsViewModelModule::class
])
abstract class NotificationsModuleProvider