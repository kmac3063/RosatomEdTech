package com.example.rosatomedtech.ui.views.main.fragments.profile.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.interactor.ProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.view.ProfileMVPView

interface ProfileMVPPresenter<V : ProfileMVPView, I : ProfileMVPInteractor> : MVPPresenter<V, I> {

}

