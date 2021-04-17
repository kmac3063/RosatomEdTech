package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyMVPView

class AcademyProfilePresenter<V : AcademyMVPView, I : AcademyProfileMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), AcademyProfileMVPPresenter<V, I> {

}

