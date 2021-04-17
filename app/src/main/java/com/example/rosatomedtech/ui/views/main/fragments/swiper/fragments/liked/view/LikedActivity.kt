package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.interactor.LikedInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.interactor.LikedMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.liked.presenter.LikedPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class LikedActivity : BaseActivity(), LikedMVPView {
    var presenter = LikedPresenter<LikedMVPView, LikedMVPInteractor>(
        LikedInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openLikedActivity()
    }

    override fun openLikedActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
