package com.daggertest.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.daggertest.di.component.DaggerUserComponent
import javax.inject.Inject

class DiActivity : AppCompatActivity() {
    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerUserComponent.builder().param("this is a parameter").build().inject(this)
        Toast.makeText(this, user.testComponentBuilder(), Toast.LENGTH_LONG).show()
    }
}