package com.example.rosatomedtech.data.objects

import androidx.room.Entity

@Entity(tableName = "student_table")
data class Student(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val age: Int


)
