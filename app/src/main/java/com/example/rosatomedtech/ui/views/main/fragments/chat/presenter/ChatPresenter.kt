package com.example.rosatomedtech.ui.views.main.fragments.chat.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.interactor.ChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.view.ChatMVPView

class ChatPresenter<V : ChatMVPView, I : ChatMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), ChatMVPPresenter<V, I> {

}

