package com.example.playzone_mobile.android

import PlatformConfiguration
import PlatformSDK
import android.app.Application

class PlayzoneApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initPlatformSDK()
    }
}

private fun PlayzoneApp.initPlatformSDK() =
    PlatformSDK.init(
        configuration = PlatformConfiguration(androidContext = applicationContext)
    )