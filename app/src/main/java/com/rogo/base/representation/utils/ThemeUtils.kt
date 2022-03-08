package com.rogo.base.representation.utils

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import com.rogo.base.data.data_source.preferences.ThemePreference


fun Context.setDarkModeTheme(isDarkMode: Boolean) {
    if (isDarkMode) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    } else {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}