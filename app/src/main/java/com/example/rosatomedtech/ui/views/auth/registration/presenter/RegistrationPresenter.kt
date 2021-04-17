package com.example.rosatomedtech.ui.views.auth.registration.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.auth.registration.interactor.RegistrationMVPInteractor
import com.example.rosatomedtech.ui.views.auth.registration.view.RegistrationMVPView

class RegistrationPresenter<V : RegistrationMVPView, I : RegistrationMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), RegistrationMVPPresenter<V, I> {

}