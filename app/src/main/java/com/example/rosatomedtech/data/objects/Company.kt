package com.example.rosatomedtech.data.objects

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "company_table")
data class Company(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val Name: String,
    val login: String,
    val password: String,
    val description: String

)


