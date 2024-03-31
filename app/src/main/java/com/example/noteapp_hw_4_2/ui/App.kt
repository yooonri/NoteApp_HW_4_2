package com.example.noteapp_hw_4_2.ui

import android.app.Application
import com.example.noteapp_hw_4_2.ui.utils.PreferenceHelper

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper()
        sharedPreferences.unit(this)
    }
}