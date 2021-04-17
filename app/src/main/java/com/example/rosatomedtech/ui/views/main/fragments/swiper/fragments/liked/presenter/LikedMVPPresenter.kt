package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.interactor.LikedMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.view.LikedMVPView

interface LikedMVPPresenter<V : LikedMVPView, I : LikedMVPInteractor> : MVPPresenter<V, I> {

}

