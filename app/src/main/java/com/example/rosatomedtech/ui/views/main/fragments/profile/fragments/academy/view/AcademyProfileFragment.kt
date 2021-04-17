package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyProfileInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.interactor.AcademyProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.presenter.AcademyProfilePresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class AcademyProfileFragment : BaseFragment(), AcademyMVPView {
    var presenter = AcademyProfilePresenter<AcademyMVPView, AcademyProfileMVPInteractor>(
        AcademyProfileInteractor(AppPreferenceHelper(requireContext()))
    )

    companion object {
        fun newInstance(): AcademyProfileFragment {
            val fragment = AcademyProfileFragment()

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
        return inflater.inflate(R.layout.fragment_academy_profile,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.onAttach(this)
    }
}
