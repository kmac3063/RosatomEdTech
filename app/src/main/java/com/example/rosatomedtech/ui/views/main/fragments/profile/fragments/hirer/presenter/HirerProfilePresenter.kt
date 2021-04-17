package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view.HirerProfileMVPView

class HirerProfilePresenter<V : HirerProfileMVPView, I : HirerProfileMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), HirerProfileMVPPresenter<V, I> {

}

