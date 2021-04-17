package com.example.rosatomedtech.data.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.data.objects.Student


interface MVPDataModel {

    fun getCardStackList(): List<Card>

    fun doCreateNewStudent(student: Student)
}