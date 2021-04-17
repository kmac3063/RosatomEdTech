package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.interactor.HirerChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.view.HirerChatMVPView

class HirerChatPresenter<V : HirerChatMVPView, I : HirerChatMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), HirerChatMVPPresenter<V, I> {

}

