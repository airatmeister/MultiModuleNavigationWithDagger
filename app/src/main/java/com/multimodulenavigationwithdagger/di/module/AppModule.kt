package com.multimodulenavigationwithdagger.di.module

import android.app.Application
import android.content.Context
import com.multimodulenavigationwithdagger.App
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(app: App): Context {
        return app.applicationContext
    }

    @Provides
    fun provideApplication(app: App): Application {
        return app
    }
}