package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.UserInfo

interface MVPDataModel {
    fun doCreateNewUser(user: UserInfo)
}