package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.interactor.HirerChatInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.interactor.HirerChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.presenter.HirerChatPresenter

class HirerChatFragment : BaseFragment(), HirerChatMVPView {
    lateinit var presenter: HirerChatPresenter<HirerChatMVPView, HirerChatMVPInteractor>

    companion object {
        fun newInstance(): HirerChatFragment {
            val fragment = HirerChatFragment()

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
        return inflater.inflate(R.layout.fragment_hirer_chat,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = HirerChatPresenter<HirerChatMVPView, HirerChatMVPInteractor>(
            HirerChatInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)
    }
}
