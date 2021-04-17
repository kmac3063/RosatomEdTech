package com.example.rosatomedtech.data.preferences

import com.example.rosatomedtech.utils.AppConstants

interface PreferenceHelper {
    fun setCurrentUserId(id: Long)
    fun getCurrentUserId(): Long?

    fun getCurrentUserType() : AppConstants.UserType
}