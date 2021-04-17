package com.example.rosatomedtech.ui.base.interactor

import com.example.rosatomedtech.data.preferences.PreferenceHelper

open class BaseInteractor : MVPInteractor {
    protected lateinit var preferenceHelper: PreferenceHelper

    constructor(preferenceHelper: PreferenceHelper) {
        this.preferenceHelper = preferenceHelper
    }
}