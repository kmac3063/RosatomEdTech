package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.interactor.HirerChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.view.HirerChatMVPView

interface HirerChatMVPPresenter<V : HirerChatMVPView, I : HirerChatMVPInteractor> : MVPPresenter<V, I> {

}

