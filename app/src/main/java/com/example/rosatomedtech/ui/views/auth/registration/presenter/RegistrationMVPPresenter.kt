package com.example.rosatomedtech.ui.views.auth.registration.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.auth.registration.interactor.RegistrationMVPInteractor
import com.example.rosatomedtech.ui.views.auth.registration.view.RegistrationMVPView

interface RegistrationMVPPresenter<V : RegistrationMVPView, I : RegistrationMVPInteractor> :
    MVPPresenter<V, I> {

}