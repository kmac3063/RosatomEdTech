package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.view.StudentMVPView

class StudentPresenter<V : StudentMVPView, I : StudentMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), StudentMVPPresenter<V, I> {

}

