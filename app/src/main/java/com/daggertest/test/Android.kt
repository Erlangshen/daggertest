package com.daggertest.test

import android.util.Log

import javax.inject.Inject

class Android @Inject
constructor() {
    init {
        Log.e("abc", "--- new Android ---")
    }
}
