package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.data.objects.Student


interface MVPDataModel{

    fun getCardStackList(): List<Card>

    fun doCreateNewStudent(student: Student)
}