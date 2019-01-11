package com.daggertest.di.module

import android.app.Application
import com.daggertest.test.ZhuangBiScope
import dagger.Module
import dagger.Provides

@Module
class AppModule(var myApp: Application) {
    @Provides
    @ZhuangBiScope
    fun providesApplication(): Application = myApp
}