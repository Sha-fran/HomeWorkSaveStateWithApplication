package com.example.homeworksavestatewithapplication

import android.app.Application

class MyApplication:Application() {
    var numberOfClicks:Int = 0

    override fun onCreate() {
        super.onCreate()

        instance = this
    }

    fun addNumber() {
        numberOfClicks += 1
    }

    companion object {
        private lateinit var instance:MyApplication
        fun getApp() = instance
    }
}
