package com.example.rosatomedtech.ui.views.main.fragments.analytics.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.analytics.interactor.AnalyticsInteractor
import com.example.rosatomedtech.ui.views.main.fragments.analytics.interactor.AnalyticsMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.analytics.presenter.AnalyticsPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class AnalyticsActivity : BaseActivity(), AnalyticsMVPView {
    var presenter = AnalyticsPresenter<AnalyticsMVPView, AnalyticsMVPInteractor>(
        AnalyticsInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openAnalyticsActivity()
    }

    override fun openAnalyticsActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
