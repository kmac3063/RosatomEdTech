package com.example.rosatomedtech.ui.views.main.fragments.jobRequest.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.interactor.JobRequestMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.view.JobRequestMVPView

interface JobRequestMVPPresenter<V : JobRequestMVPView, I : JobRequestMVPInteractor> : MVPPresenter<V, I> {

}

