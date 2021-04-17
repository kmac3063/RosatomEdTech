package com.example.rosatomedtech.ui.views.main.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.interactor.MainMVPInteractor
import com.example.rosatomedtech.ui.views.main.view.MainMVPView

class MainPresenter<V : MainMVPView, I : MainMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), MainMVPPresenter<V, I> {

}