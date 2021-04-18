package com.example.rosatomedtech.data.objects

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "card_table")
data class Card(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val imgUrl: String,
    @ForeignKey(entity = Company::class, onDelete = ForeignKey.CASCADE, parentColumns = ["id"], childColumns = ["id", "imgUrl"])
    val company: Company
    )
