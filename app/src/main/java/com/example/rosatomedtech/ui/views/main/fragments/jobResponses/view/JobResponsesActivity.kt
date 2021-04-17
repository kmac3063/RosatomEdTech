package com.example.rosatomedtech.ui.views.main.fragments.jobResponses.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.interactor.JobResponsesInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.interactor.JobResponsesMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.presenter.JobResponsesPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class JobResponsesActivity : BaseActivity(), JobResponsesMVPView {
    lateinit var presenter: JobResponsesPresenter<JobResponsesMVPView, JobResponsesMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = JobResponsesPresenter(
            JobResponsesInteractor(AppPreferenceHelper(this))
        )
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openJobResponsesActivity()
    }

    override fun openJobResponsesActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
