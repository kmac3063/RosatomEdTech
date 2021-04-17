package com.example.rosatomedtech.ui.views.main.fragments.profile.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.interactor.ProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.view.ProfileMVPView

class ProfilePresenter<V : ProfileMVPView, I : ProfileMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), ProfileMVPPresenter<V, I> {

}

