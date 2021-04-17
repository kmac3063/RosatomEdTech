package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view.HirerMVPView

interface HirerMVPPresenter<V : HirerMVPView, I : HirerMVPInteractor> : MVPPresenter<V, I> {

}

