package com.example.rosatomedtech.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.rosatomedtech.utils.AppConstants

class AppPreferenceHelper(context: Context) : PreferenceHelper {
    companion object {
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_USER_ID"
        private val PREF_KEY_CURRENT_USER_LOGIN_MODE = "PREF_KEY_LOGIN_MODE"
    }

    private val prefFileName: String = AppConstants.PREF_NAME
    private val mPref: SharedPreferences =
        context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserId() = mPref.getLong(PREF_KEY_CURRENT_USER_ID, -1)

    override fun setCurrentUserId(id: Long) {
        mPref.edit {
            putLong(PREF_KEY_CURRENT_USER_ID, id)
        }
    }
}