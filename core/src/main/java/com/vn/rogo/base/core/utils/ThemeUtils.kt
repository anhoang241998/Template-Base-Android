package com.vn.rogo.base.core.utils

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate


fun Context.setDarkModeTheme(isDarkMode: Boolean) {
    if (isDarkMode) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    } else {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}