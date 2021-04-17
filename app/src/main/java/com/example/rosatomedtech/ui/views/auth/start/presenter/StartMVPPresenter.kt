package com.example.rosatomedtech.ui.views.auth.start.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.auth.start.interactor.StartMVPInteractor
import com.example.rosatomedtech.ui.views.auth.start.view.StartMVPView

interface StartMVPPresenter<V: StartMVPView, I: StartMVPInteractor>: MVPPresenter<V, I> {

}