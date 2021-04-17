package com.example.rosatomedtech.data.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.objects.Student

@Dao
interface MVPDataModel {

    @Query("SELECT * FROM card_table ORDER BY id ASC")
    fun getCardStackList(): List<CardStackInfo>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun doCreateNewStudent(student: Student)
}