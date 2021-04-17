package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.view.StudentMVPView

interface StudentMVPPresenter<V : StudentMVPView, I : StudentMVPInteractor> : MVPPresenter<V, I> {

}

