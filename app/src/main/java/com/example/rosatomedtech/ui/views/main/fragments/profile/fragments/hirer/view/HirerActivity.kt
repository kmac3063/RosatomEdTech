package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter.HirerPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class HirerActivity : BaseActivity(), HirerMVPView {
    var presenter = HirerPresenter<HirerMVPView, HirerMVPInteractor>(
        HirerInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openHirerActivity()
    }

    override fun openHirerActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
