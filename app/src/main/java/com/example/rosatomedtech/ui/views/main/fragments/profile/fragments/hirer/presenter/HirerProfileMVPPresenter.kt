package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view.HirerProfileMVPView

interface HirerProfileMVPPresenter<V : HirerProfileMVPView, I : HirerProfileMVPInteractor> : MVPPresenter<V, I> {

}

