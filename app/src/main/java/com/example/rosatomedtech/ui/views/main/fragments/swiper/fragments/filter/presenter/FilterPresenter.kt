package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.view.FilterMVPView

class FilterPresenter<V : FilterMVPView, I : FilterMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), FilterMVPPresenter<V, I> {

}

