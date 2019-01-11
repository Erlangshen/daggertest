package com.daggertest.di.component

import com.daggertest.di.module.UserModule
import com.daggertest.test.DiActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [(UserModule::class)])
interface UserComponent {
    fun inject(diActivity: DiActivity)
    @Component.Builder
    interface Builder {
        fun build(): UserComponent
        @BindsInstance
        fun param(params: String): Builder
    }
}