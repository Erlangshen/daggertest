package com.daggertest.di.module

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.util.Log
import com.daggertest.test.Cat
import com.daggertest.test.Dog
import com.daggertest.test.ZhuangBiScope
import com.daggertest.test.Tested
import dagger.Module
import dagger.Provides

@Module
class AnimalModule {
    @Provides
    @ZhuangBiScope
    fun providesDog(): Dog {
        Log.e("abc", "----- AnimalModule Dog -----")
        return Dog()
    }

    @Provides
    @Tested("dog")
    @ZhuangBiScope
    fun providesCat(dog: Dog): Cat {
        Log.e("abc", "----- AnimalModule Cat withdog -----")
        return Cat(dog)
    }

    @Provides
    @Tested("dog2")
    @ZhuangBiScope
    fun providesCat2(dog: Dog): Cat {
        Log.e("abc", "----- AnimalModule Cat withdog2 -----")
        return Cat(dog)
    }


    @Provides
    @ZhuangBiScope
    fun providesSharedPreference(application: Application): SharedPreferences {
        Log.e("abc", "----- AnimalModule SharedPreferences -----")
        return PreferenceManager.getDefaultSharedPreferences(application)
    }
}