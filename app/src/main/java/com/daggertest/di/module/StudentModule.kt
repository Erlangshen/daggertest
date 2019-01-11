package com.daggertest.di.module

import com.daggertest.test.Student
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StudentModule {

    /*这种实体类不要单例，否则全局只有一个对象，不符合基本常识*/

    //@Singleton
    @Provides
    fun provideStudent(): Student = Student()
}