package com.example.rosatomedtech.ui.base.presenter

import com.example.rosatomedtech.ui.base.interactor.MVPInteractor
import com.example.rosatomedtech.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {
    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?
}