package com.example.rosatomedtech.ui.views.main.fragments.analytics.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.analytics.interactor.AnalyticsMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.analytics.view.AnalyticsMVPView

interface AnalyticsMVPPresenter<V : AnalyticsMVPView, I : AnalyticsMVPInteractor> : MVPPresenter<V, I> {

}

