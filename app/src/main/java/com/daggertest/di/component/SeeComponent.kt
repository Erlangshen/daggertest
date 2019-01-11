package com.daggertest.di.component

import com.daggertest.test.SeeActivity
import dagger.Subcomponent

@Subcomponent
interface SeeComponent {
    fun inject(cActivity: SeeActivity)
}