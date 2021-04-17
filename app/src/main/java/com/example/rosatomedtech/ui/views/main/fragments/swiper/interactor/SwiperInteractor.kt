package com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor

import com.example.rosatomedtech.data.model.DataModel
import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.preferences.PreferenceHelper
import com.example.rosatomedtech.ui.base.interactor.BaseInteractor

class SwiperInteractor(preferenceHelper: PreferenceHelper) :
BaseInteractor(preferenceHelper), SwiperMVPInteractor {
    override fun doGetCardStackList(): List<CardStackInfo> {
        return DataModel.getCardStackList()
    }

}

