package com.example.rosatomedtech.ui.views.main.view

import com.example.rosatomedtech.ui.base.view.MVPView

interface MainMVPView : MVPView {
    fun onFilterBackPressed()
    fun cardSwiped()
}