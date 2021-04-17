package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyMVPView

interface AcademyProfileMVPPresenter<V : AcademyMVPView, I : AcademyProfileMVPInteractor> : MVPPresenter<V, I> {

}

