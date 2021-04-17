package com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyMVPView
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.interactor.FilterMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.fragments.filter.presenter.FilterPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class FilterFragment : BaseFragment(), FilterMVPView {
    lateinit var presenter: FilterPresenter<FilterMVPView, FilterMVPInteractor>

    companion object {
        fun newInstance(): FilterFragment {
            val fragment = FilterFragment()

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
        return inflater.inflate(R.layout.fragment_swiper_filter,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = FilterPresenter(
            FilterInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)
    }
}
