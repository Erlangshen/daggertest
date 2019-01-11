package com.daggertest.test

class User {
    lateinit var params: String

    constructor(params: String) {
        this.params = params
    }

    fun testComponentBuilder() = "This is the Inject with parameter:$params"
}