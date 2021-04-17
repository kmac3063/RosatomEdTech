package com.example.rosatomedtech.ui.views.main.fragments.studentsList.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.interactor.StudentsListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.view.StudentsListMVPView

class StudentsListPresenter<V : StudentsListMVPView, I : StudentsListMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), StudentsListMVPPresenter<V, I> {

}

