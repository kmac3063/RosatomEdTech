package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.view.FilterMVPView

interface FilterMVPPresenter<V : FilterMVPView, I : FilterMVPInteractor> : MVPPresenter<V, I> {

}

