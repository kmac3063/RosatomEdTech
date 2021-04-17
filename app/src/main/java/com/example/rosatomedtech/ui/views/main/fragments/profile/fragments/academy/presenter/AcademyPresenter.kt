package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyMVPView

class AcademyPresenter<V : AcademyMVPView, I : AcademyMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), AcademyMVPPresenter<V, I> {

}

