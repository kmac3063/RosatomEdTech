package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.presenter.FilterPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class FilterActivity : BaseActivity(), FilterMVPView {
    var presenter = FilterPresenter<FilterMVPView, FilterMVPInteractor>(
        FilterInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openFilterActivity()
    }

    override fun openFilterActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
