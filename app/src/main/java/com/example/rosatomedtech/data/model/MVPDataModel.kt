package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.Student

interface MVPDataModel {

    fun getCardStackList()
    fun doCreateNewUser(student: Student)
}