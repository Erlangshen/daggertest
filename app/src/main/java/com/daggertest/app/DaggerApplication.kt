package com.daggertest.app

import android.app.Application
import com.daggertest.di.component.AnimalComponent
import com.daggertest.di.component.BComponent
import com.daggertest.di.component.DaggerAnimalComponent
import com.daggertest.di.component.DaggerBComponent
import com.daggertest.di.module.AppModule

class DaggerApplication : Application() {
    var animalComponent: AnimalComponent? = null
    var bComponent: BComponent? = null

    override fun onCreate() {
        super.onCreate()
        bComponent = DaggerBComponent.builder().build()
        animalComponent = DaggerAnimalComponent.builder()
                .appModule(AppModule(this))
//                .animalModule(AnimalModule())//有没有都可以
                .bComponent(bComponent)
                .build()
    }
}