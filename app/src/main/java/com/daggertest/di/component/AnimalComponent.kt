package com.daggertest.di.component

import com.daggertest.di.module.AnimalModule
import com.daggertest.di.module.AppModule
import com.daggertest.test.ZhuangBiScope
import com.daggertest.test.SecondActivity
import dagger.Component

@ZhuangBiScope
@Component(dependencies = [(BComponent::class)], modules = [(AppModule::class), (AnimalModule::class)])
interface AnimalComponent {
    fun inject(secondActivity: SecondActivity)
    fun getSeeComponent(): SeeComponent
}