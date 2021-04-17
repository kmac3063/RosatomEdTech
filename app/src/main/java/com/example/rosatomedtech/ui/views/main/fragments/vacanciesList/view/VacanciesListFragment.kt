package com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.interactor.VacanciesListMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.presenter.VacanciesListPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class VacanciesListFragment : BaseFragment(), VacanciesListMVPView {
    lateinit var presenter: VacanciesListPresenter<VacanciesListMVPView, VacanciesListMVPInteractor>

    companion object {
        fun newInstance(): VacanciesListFragment {
            val fragment = VacanciesListFragment()

//        val args = Bundle()
//        fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_vacancies_list,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = VacanciesListPresenter<VacanciesListMVPView, VacanciesListMVPInteractor>(
            VacanciesListInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)
    }
}
