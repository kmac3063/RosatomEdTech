package com.example.rosatomedtech.ui.views.main.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.interactor.MainMVPInteractor
import com.example.rosatomedtech.ui.views.main.view.MainMVPView

interface MainMVPPresenter<V : MainMVPView, I: MainMVPInteractor>: MVPPresenter<V, I> {

}