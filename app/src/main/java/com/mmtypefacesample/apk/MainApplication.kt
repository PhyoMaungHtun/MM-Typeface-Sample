package com.mmtypefacesample.apk

import android.app.Application
import com.mmtypefacesample.apk.utils.TypefaceManager
import me.myatminsoe.mdetect.MDetect

class MainApplication : Application() {
    companion object{
        lateinit var typefaceManager: TypefaceManager
    }

    override fun onCreate() {
        super.onCreate()
        MDetect.init(this)
        typefaceManager = TypefaceManager(assets, applicationContext)
    }
}