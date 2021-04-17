package com.example.rosatomedtech.ui.views.auth.start.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.auth.start.interactor.StartMVPInteractor
import com.example.rosatomedtech.ui.views.auth.start.view.StartMVPView

class StartPresenter<V : StartMVPView, I : StartMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), StartMVPPresenter<V, I> {

}