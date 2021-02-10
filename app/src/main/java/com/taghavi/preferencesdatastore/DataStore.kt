package com.taghavi.preferencesdatastore

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DataStore : Application() {
    override fun onCreate() {
        super.onCreate()
    }

}