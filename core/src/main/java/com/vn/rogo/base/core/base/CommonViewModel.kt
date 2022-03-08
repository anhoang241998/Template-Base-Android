package com.vn.rogo.base.core.base

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vn.rogo.base.core.utils.setDarkModeTheme
import com.vn.rogo.data.data_source.preferences.ThemePreference
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CommonViewModel @Inject constructor() : ViewModel() {


    fun setDarkMode(isDarkMode: Boolean, context: Context) {
        viewModelScope.launch {
            ThemePreference.setDarkMode(context, isDarkMode)
        }
        context.setDarkModeTheme(isDarkMode)
    }
}