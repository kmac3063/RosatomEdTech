package com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.student.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentChatInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.interactor.StudentChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.presenter.StudentChatPresenter
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.student.view.StudentChatMVPView

class StudentChatFragment : BaseFragment(), StudentChatMVPView {
    var presenter = StudentChatPresenter<StudentChatMVPView, StudentChatMVPInteractor>(
        StudentChatInteractor(AppPreferenceHelper(requireContext()))
    )

    companion object {
        fun newInstance(): StudentChatFragment {
            val fragment = StudentChatFragment()

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
        return inflater.inflate(R.layout.fragment_student_chat, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.onAttach(this)
    }
}
