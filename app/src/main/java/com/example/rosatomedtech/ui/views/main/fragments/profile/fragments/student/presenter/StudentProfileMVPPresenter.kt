package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.view.StudentProfileMVPView

interface StudentProfileMVPPresenter<V : StudentProfileMVPView, I : StudentProfileMVPInteractor> : MVPPresenter<V, I> {

}

