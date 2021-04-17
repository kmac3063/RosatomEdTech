package com.example.rosatomedtech.ui.views.main.fragments.swiper.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter.SwiperPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class SwiperActivity : BaseActivity(), SwiperMVPView {
    var presenter = SwiperPresenter<SwiperMVPView, SwiperMVPInteractor>(
        SwiperInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openSwiperActivity()
    }

    override fun openSwiperActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
