package com.daggertest.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.daggertest.app.DaggerApplication
import javax.inject.Inject

class BActivity : AppCompatActivity() {
    @Inject
    lateinit var stu: Student
    @Inject
    lateinit var android: Android

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as DaggerApplication).bComponent?.inject(this)//此句属于初始化，必须有
        Log.e("abc", "---> $stu ")
    }
}