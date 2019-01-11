package com.daggertest.di.module

import com.daggertest.test.User
import dagger.Module
import dagger.Provides
@Module
class UserModule {
    @Provides
    fun provideUser(params: String) = User(params)
}