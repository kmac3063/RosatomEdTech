package com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.view.VacanciesListMVPView

interface VacanciesListMVPPresenter<V : VacanciesListMVPView, I : VacanciesListMVPInteractor> : MVPPresenter<V, I> {

}

