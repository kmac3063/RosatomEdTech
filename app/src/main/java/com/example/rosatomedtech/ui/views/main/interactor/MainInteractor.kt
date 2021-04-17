package com.example.rosatomedtech.ui.views.main.interactor

import com.example.rosatomedtech.data.preferences.PreferenceHelper
import com.example.rosatomedtech.ui.base.interactor.BaseInteractor
import com.example.rosatomedtech.ui.base.interactor.MVPInteractor

class MainInteractor(preferenceHelper: PreferenceHelper) :
    BaseInteractor(preferenceHelper), MainMVPInteractor  {
}