package com.example.rosatomedtech.ui.views.auth.login.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.auth.login.interactor.LoginMVPInteractor
import com.example.rosatomedtech.ui.views.auth.login.view.LoginMVPView

class LoginPresenter<V : LoginMVPView, I : LoginMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), LoginMVPPresenter<V, I> {

}