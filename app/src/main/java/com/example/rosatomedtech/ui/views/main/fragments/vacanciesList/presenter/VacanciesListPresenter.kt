package com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.view.VacanciesListMVPView

class VacanciesListPresenter<V : VacanciesListMVPView, I : VacanciesListMVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), VacanciesListMVPPresenter<V, I> {

}

