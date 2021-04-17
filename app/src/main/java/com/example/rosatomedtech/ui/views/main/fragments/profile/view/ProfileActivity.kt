package com.example.rosatomedtech.ui.views.main.fragments.profile.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.profile.interactor.ProfileInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.interactor.ProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.presenter.ProfilePresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class ProfileActivity : BaseActivity(), ProfileMVPView {
    var presenter = ProfilePresenter<ProfileMVPView, ProfileMVPInteractor>(
        ProfileInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openProfileActivity()
    }

    override fun openProfileActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
