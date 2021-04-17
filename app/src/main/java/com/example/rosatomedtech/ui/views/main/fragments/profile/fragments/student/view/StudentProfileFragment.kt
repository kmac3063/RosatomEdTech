package com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentProfileInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.interactor.StudentProfileMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.presenter.StudentProfilePresenter

class StudentProfileFragment : BaseFragment(), StudentProfileMVPView {
    var presenter = StudentProfilePresenter<StudentProfileMVPView, StudentProfileMVPInteractor>(
        StudentProfileInteractor(AppPreferenceHelper(requireContext()))
    )

    companion object {
        fun newInstance(): StudentProfileFragment {
            val fragment = StudentProfileFragment()

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
        return inflater.inflate(R.layout.fragment_student_profile,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.onAttach(this)
    }
}
