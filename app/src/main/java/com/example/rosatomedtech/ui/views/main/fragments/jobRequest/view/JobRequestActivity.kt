package com.example.rosatomedtech.ui.views.main.fragments.jobRequest.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.interactor.JobRequestInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.interactor.JobRequestMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.presenter.JobRequestPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class JobRequestActivity : BaseActivity(), JobRequestMVPView {
    var presenter = JobRequestPresenter<JobRequestMVPView, JobRequestMVPInteractor>(
        JobRequestInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openJobRequestActivity()
    }

    override fun openJobRequestActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
