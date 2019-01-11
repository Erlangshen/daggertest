package com.daggertest.test

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import com.daggertest.app.DaggerApplication
import javax.inject.Inject

class SeeActivity : FragmentActivity() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences
    @Inject
    lateinit var stu: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as DaggerApplication).animalComponent?.getSeeComponent()?.inject(this)
        Log.e("abc", "---> $sharedPreferences")
        Log.e("abc", "---> $stu")
    }
}