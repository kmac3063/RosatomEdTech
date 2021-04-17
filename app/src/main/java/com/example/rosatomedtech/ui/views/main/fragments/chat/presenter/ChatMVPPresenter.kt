package com.example.rosatomedtech.ui.views.main.fragments.chat.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.interactor.ChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.view.ChatMVPView

interface ChatMVPPresenter<V : ChatMVPView, I : ChatMVPInteractor> : MVPPresenter<V, I> {

}

