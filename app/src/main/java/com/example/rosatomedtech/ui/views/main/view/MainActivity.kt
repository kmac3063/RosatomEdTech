package com.example.rosatomedtech.ui.views.main.view

import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.interactor.MainInteractor
import com.example.rosatomedtech.ui.views.main.interactor.MainMVPInteractor
import com.example.rosatomedtech.ui.views.main.presenter.MainPresenter

class MainActivity: BaseActivity(), MainMVPView {
    var presenter = MainPresenter<MainMVPView, MainMVPInteractor>(
        MainInteractor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val navigation = findViewById(R.id.main_navigation)
    }
}