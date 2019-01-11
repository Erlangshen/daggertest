package com.daggertest.di.component

import com.daggertest.di.module.PersonModule
import com.daggertest.di.module.StudentModule
import com.daggertest.test.BActivity
import com.daggertest.test.Person
import com.daggertest.test.Student
import dagger.Component
import javax.inject.Singleton

/**
 * 这个Component给别的Component依赖，它不可以有多余的方法，而且所有使用到了的Module的方法必须提供一个同类的方法。
 */
@Singleton
@Component(modules = [(PersonModule::class), (StudentModule::class)])
interface BComponent {
    fun inject(bActivity: BActivity)
    fun person(): Person
    fun provideStudent(): Student
//    fun test(): String
}