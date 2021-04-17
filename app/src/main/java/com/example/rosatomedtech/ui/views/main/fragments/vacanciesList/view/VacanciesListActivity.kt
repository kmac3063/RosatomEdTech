package com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.presenter.VacanciesListPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class VacanciesListActivity : BaseActivity(), VacanciesListMVPView {
    var presenter = VacanciesListPresenter<VacanciesListMVPView, VacanciesListMVPInteractor>(
        VacanciesListInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openVacanciesListActivity()
    }

    override fun openVacanciesListActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
