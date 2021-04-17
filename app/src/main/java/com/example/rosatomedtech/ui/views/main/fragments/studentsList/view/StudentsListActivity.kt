package com.example.rosatomedtech.ui.views.main.fragments.studentsList.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.interactor.StudentsListInteractor
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.interactor.StudentsListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.studentsList.presenter.StudentsListPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class StudentsListActivity : BaseActivity(), StudentsListMVPView {
    var presenter = StudentsListPresenter<StudentsListMVPView, StudentsListMVPInteractor>(
        StudentsListInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openStudentsListActivity()
    }

    override fun openStudentsListActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
