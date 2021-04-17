package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view.HirerMVPView

class HirerPresenter<V : HirerMVPView, I : HirerMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), HirerMVPPresenter<V, I> {

}

