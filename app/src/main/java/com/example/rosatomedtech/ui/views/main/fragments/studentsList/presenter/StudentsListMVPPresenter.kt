package com.example.rosatomedtech.ui.views.main.fragments.studentsList.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.interactor.StudentsListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.view.StudentsListMVPView

interface StudentsListMVPPresenter<V : StudentsListMVPView, I : StudentsListMVPInteractor> : MVPPresenter<V, I> {

}

