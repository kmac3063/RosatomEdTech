package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.view.StudentChatMVPView

interface StudentChatMVPPresenter<V : StudentChatMVPView, I : StudentChatMVPInteractor> : MVPPresenter<V, I> {

}

