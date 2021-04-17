package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.view.StudentProfileMVPView

class StudentProfilePresenter<V : StudentProfileMVPView, I : StudentProfileMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), StudentProfileMVPPresenter<V, I> {

}

