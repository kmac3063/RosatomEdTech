package com.example.rosatomedtech.ui.views.auth.registration.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.auth.registration.interactor.RegistrationInteractor
import com.example.rosatomedtech.ui.views.auth.registration.interactor.RegistrationMVPInteractor
import com.example.rosatomedtech.ui.views.auth.registration.presenter.RegistrationPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class RegistrationActivity : BaseActivity(), RegistrationMVPView {
    var presenter = RegistrationPresenter<RegistrationMVPView, RegistrationMVPInteractor>(
        RegistrationInteractor(AppPreferenceHelper(this))
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