package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.academy.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.academy.interactor.AcademyInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.academy.interactor.AcademyMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.academy.presenter.AcademyPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class AcademyActivity : BaseActivity(), AcademyMVPView {
    var presenter = AcademyPresenter<AcademyMVPView, AcademyMVPInteractor>(
        AcademyInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openAcademyActivity()
    }

    override fun openAcademyActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
