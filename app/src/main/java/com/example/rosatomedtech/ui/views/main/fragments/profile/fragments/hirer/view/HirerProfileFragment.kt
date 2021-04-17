package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerProfileInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.interactor.HirerProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.presenter.HirerProfilePresenter

class HirerProfileFragment : BaseFragment(), HirerProfileMVPView {
    var presenter = HirerProfilePresenter<HirerProfileMVPView, HirerProfileMVPInteractor>(
        HirerProfileInteractor(AppPreferenceHelper(requireContext()))
    )

    companion object {
        fun newInstance(): HirerProfileFragment {
            val fragment = HirerProfileFragment()

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
        return inflater.inflate(R.layout.fragment_hirer_profile,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.onAttach(this)
    }
}
