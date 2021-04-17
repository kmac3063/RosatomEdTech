package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyMVPView

interface AcademyMVPPresenter<V : AcademyMVPView, I : AcademyMVPInteractor> : MVPPresenter<V, I> {

}

