package com.example.rosatomedtech.ui.views.main.fragments.jobRequest.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.interactor.JobRequestMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobRequest.view.JobRequestMVPView

class JobRequestPresenter<V : JobRequestMVPView, I : JobRequestMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), JobRequestMVPPresenter<V, I> {

}

