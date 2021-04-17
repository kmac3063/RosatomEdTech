package com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter

import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.view.SwiperMVPView

class SwiperPresenter<V : SwiperMVPView, I : SwiperMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), SwiperMVPPresenter<V, I> {

    override fun getCardStackList(): List<Card> {
        return interactor?.doGetCardStackList() ?: emptyList()
    }
}

