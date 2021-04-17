package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.view.StudentChatMVPView

class StudentChatPresenter<V : StudentChatMVPView, I : StudentChatMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), StudentChatMVPPresenter<V, I> {

}

