package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.interactor.LikedMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.view.LikedMVPView

class LikedPresenter<V : LikedMVPView, I : LikedMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), LikedMVPPresenter<V, I> {

}

