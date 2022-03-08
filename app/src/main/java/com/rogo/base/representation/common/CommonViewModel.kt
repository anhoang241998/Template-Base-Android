package com.rogo.base.representation.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rogo.base.data.data_source.preferences.ThemePreference
import com.rogo.base.representation.utils.setDarkModeTheme
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