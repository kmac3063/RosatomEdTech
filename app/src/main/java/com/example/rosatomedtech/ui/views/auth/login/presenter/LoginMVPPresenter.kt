package com.example.rosatomedtech.ui.views.auth.login.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.auth.login.interactor.LoginMVPInteractor
import com.example.rosatomedtech.ui.views.auth.login.view.LoginMVPView

interface LoginMVPPresenter<V : LoginMVPView, I : LoginMVPInteractor> : MVPPresenter<V, I> {

}