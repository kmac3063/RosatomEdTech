package com.example.rosatomedtech.ui.views.main.fragments.jobResponses.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.interactor.JobResponsesMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.view.JobResponsesMVPView

class JobResponsesPresenter<V : JobResponsesMVPView, I : JobResponsesMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), JobResponsesMVPPresenter<V, I> {

}

