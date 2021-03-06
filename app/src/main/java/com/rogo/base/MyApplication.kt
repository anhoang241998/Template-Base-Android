package com.rogo.base

import android.app.Application
import com.vn.rogo.base.core.utils.setDarkModeTheme
import com.vn.rogo.data.data_source.preferences.ThemePreference
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    var isDarkMode = false

    override fun onCreate() {
        super.onCreate()
        //TODO: enable/disable dark theme
        ThemePreference.getThemePreferenceData(this, {
            // handle error
        }) {
            isDarkMode = it.isDarkMode
            setDarkModeTheme(it.isDarkMode)
        }

//        if (BuildConfig.DEBUG) {
//            Recovery.getInstance()
//                .debug(true)
//                .recoverInBackground(false)
//                .recoverStack(true)
//                .mainPage(MainActivity::class.java)
//                .recoverEnabled(true)
//                .silent(false, Recovery.SilentMode.RECOVER_ACTIVITY_STACK)
//                .init(this)
//        }
    }

}