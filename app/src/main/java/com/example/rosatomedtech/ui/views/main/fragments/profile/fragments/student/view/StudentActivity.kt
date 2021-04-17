package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.presenter.StudentPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class StudentActivity : BaseActivity(), StudentMVPView {
    var presenter = StudentPresenter<StudentMVPView, StudentMVPInteractor>(
        StudentInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openStudentActivity()
    }

    override fun openStudentActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
