package com.example.rosatomedtech.ui.views.main.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.student.view.StudentChatFragment
import com.example.rosatomedtech.ui.views.main.fragments.chat.fragments.hirer.view.HirerChatFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.academy.view.AcademyProfileFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.hirer.view.HirerProfileFragment
import com.example.rosatomedtech.ui.views.main.fragments.profile.fragments.student.view.StudentProfileFragment
import com.example.rosatomedtech.ui.views.main.fragments.swiper.view.SwiperFragment
import com.example.rosatomedtech.ui.views.main.fragments.vacanciesList.view.VacanciesListFragment
import com.example.rosatomedtech.ui.views.main.interactor.MainInteractor
import com.example.rosatomedtech.ui.views.main.interactor.MainMVPInteractor
import com.example.rosatomedtech.ui.views.main.presenter.MainPresenter
import com.example.rosatomedtech.utils.AppConstants
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity: BaseActivity(), MainMVPView {
    val preferenceHelper = AppPreferenceHelper(this)

    var presenter = MainPresenter<MainMVPView, MainMVPInteractor>(
        MainInteractor(preferenceHelper)
    )

    private val navigationListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.main_navigation_home_vacancy_list -> {
                loadFragment(VacanciesListFragment.newInstance())
                true
            }
            R.id.main_navigation_swiper -> {
                loadFragment(SwiperFragment.newInstance())
                true
            }
            R.id.main_navigation_chat -> {
                when (preferenceHelper.getCurrentUserType()) {
                    AppConstants.UserType.STUDENT -> loadFragment(StudentChatFragment.newInstance())
                    AppConstants.UserType.HIRER -> loadFragment(HirerChatFragment.newInstance())
                }
                true
            }
            R.id.main_navigation_profile -> {
                when (preferenceHelper.getCurrentUserType()) {
                    AppConstants.UserType.STUDENT -> loadFragment(StudentProfileFragment.newInstance())
                    AppConstants.UserType.HIRER -> loadFragment(HirerProfileFragment.newInstance())
                    AppConstants.UserType.ACADEMY -> loadFragment(AcademyProfileFragment.newInstance())
                }
                true
            }
            else -> false
        }
//        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<BottomNavigationView>(R.id.main_navigation)
        navigation.setOnNavigationItemSelectedListener(navigationListener)
    }

    fun loadFragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.main_container_content, fragment)
        ft.commit()
    }
}