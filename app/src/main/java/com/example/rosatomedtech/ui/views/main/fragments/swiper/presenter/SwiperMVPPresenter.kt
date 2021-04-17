package com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter

import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.view.SwiperMVPView

interface SwiperMVPPresenter<V : SwiperMVPView, I : SwiperMVPInteractor> : MVPPresenter<V, I> {
    fun getCardStackList(): List<CardStackInfo>
}

