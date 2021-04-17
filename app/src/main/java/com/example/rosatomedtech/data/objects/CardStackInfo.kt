package com.example.rosatomedtech.data.objects

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "card_table")
data class CardStackInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val imgUrl: String
    )
