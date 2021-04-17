package com.example.rosatomedtech.data.preferences

interface PreferenceHelper {
    fun setCurrentUserId(id: Long)
    fun getCurrentUserId(): Long?
}