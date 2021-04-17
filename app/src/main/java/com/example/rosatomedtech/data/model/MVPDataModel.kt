package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.objects.Student

interface MVPDataModel {

    fun getCardStackList(): List<CardStackInfo>
    fun doCreateNewStudent(student: Student)
}