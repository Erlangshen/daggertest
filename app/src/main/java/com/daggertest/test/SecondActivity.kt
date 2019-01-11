package com.daggertest.test

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log

import com.daggertest.R
import com.daggertest.app.DaggerApplication
import kotlinx.android.synthetic.main.activity_main.*

import javax.inject.Inject

class SecondActivity : Activity() {
    @Inject
    @field:Tested("dog")
    lateinit var cat: Cat
    @Inject
    @field:Tested("dog2")
    lateinit var cat2: Cat
    @Inject
    lateinit var sharedPreferences1: SharedPreferences
    @Inject
    lateinit var sharedPreferences2: SharedPreferences
    @Inject
    lateinit var person1: Person
    @Inject
    lateinit var person2: Person
    @Inject
    lateinit var student1: Student
    @Inject
    lateinit var dog1: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
//        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as DaggerApplication).animalComponent?.inject(this)
        testBtn.setOnClickListener {
            var it = Intent(this, BActivity::class.java)
            startActivity(it)
        }
        fActivity.setOnClickListener {
            var it = Intent(this, SeeActivity::class.java)
            startActivity(it)
        }
        dActivity.setOnClickListener {
            var it=Intent(this,DiActivity::class.java)
            startActivity(it)
        }

        Log.e("abc", "---> $person1")
        Log.e("abc", "---> $person2")
        Log.e("abc", "---> $sharedPreferences1")
        Log.e("abc", "---> $sharedPreferences2")
        Log.e("abc", "---> $student1")
        Log.e("abc", "---> $dog1")
    }
}
