package com.multimodulenavigationwithdagger.di.component

import com.multimodulenavigationwithdagger.App
import com.multimodulenavigationwithdagger.di.module.ActivityModule
import com.multimodulenavigationwithdagger.di.module.AppModule
import com.multimodulenavigationwithdagger.di.module.features.DashboardModule
import com.multimodulenavigationwithdagger.di.module.features.HomeModule
import com.multimodulenavigationwithdagger.di.module.features.NotificationsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class,
    DashboardModule::class,
    HomeModule::class,
    NotificationsModule::class
])
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: App): AppComponent
    }
}