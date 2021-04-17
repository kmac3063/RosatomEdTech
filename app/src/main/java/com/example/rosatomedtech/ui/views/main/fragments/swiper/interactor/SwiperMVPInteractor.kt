package com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor

import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.ui.base.interactor.MVPInteractor

interface SwiperMVPInteractor : MVPInteractor{
    fun doGetCardStackList(): List<Card>
}

