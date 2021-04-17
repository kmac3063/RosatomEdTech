package com.example.rosatomedtech.ui.views.main.fragments.analytics.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.analytics.interactor.AnalyticsMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.analytics.view.AnalyticsMVPView

class AnalyticsPresenter<V : AnalyticsMVPView, I : AnalyticsMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), AnalyticsMVPPresenter<V, I> {

}

