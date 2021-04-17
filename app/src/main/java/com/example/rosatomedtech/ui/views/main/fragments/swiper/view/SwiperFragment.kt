package com.example.rosatomedtech.ui.views.main.fragments.swiper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter.SwiperPresenter

class SwiperFragment : BaseFragment(), SwiperMVPView {
    lateinit var presenter: SwiperPresenter<SwiperMVPView, SwiperMVPInteractor>

    companion object {
        fun newInstance(): SwiperFragment {
            val fragment = SwiperFragment()

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
        return inflater.inflate(R.layout.fragment_swiper,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SwiperPresenter<SwiperMVPView, SwiperMVPInteractor>(
            SwiperInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)
    }
}
