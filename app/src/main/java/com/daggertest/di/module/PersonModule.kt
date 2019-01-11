package com.daggertest.di.module

import com.daggertest.test.Person
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersonModule {
    @Singleton
    @Provides
    fun providePerson(): Person {
        return Person()
    }
}