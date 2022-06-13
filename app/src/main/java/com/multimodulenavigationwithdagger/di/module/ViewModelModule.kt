package com.multimodulenavigationwithdagger.di.module

import com.multimodulenavigationwithdagger.core.di.module.ViewModelFactoryModule
import dagger.Module

@Module(includes = [ViewModelFactoryModule::class])
abstract class ViewModelModule