package com.example.rosatomedtech.ui.views.auth.start.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.auth.start.interactor.StartInteractor
import com.example.rosatomedtech.ui.views.auth.start.interactor.StartMVPInteractor
import com.example.rosatomedtech.ui.views.auth.start.presenter.StartPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class StartActivity : BaseActivity(), StartMVPView {
    var presenter = StartPresenter<StartMVPView, StartMVPInteractor>(
        StartInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openLoginActivity()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}