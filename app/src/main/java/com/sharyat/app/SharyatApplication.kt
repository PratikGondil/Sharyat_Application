package com.sharyat.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SharyatApplication : Application() {
    // You can add initialization logic here if needed
    override fun onCreate() {
        super.onCreate()
        // ...
    }
}