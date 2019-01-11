package com.daggertest.test

import android.util.Log

class Cat(var dog: Dog) {
    init {
        Log.e("abc", "----- new Cat -----")
    }
}
