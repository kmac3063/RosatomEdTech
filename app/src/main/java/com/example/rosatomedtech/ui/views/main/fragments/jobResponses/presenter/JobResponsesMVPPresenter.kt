package com.example.rosatomedtech.ui.views.main.fragments.jobResponses.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.interactor.JobResponsesMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.jobResponses.view.JobResponsesMVPView

interface JobResponsesMVPPresenter<V : JobResponsesMVPView, I : JobResponsesMVPInteractor> : MVPPresenter<V, I> {

}

