package com.example.rosatomedtech.data.objects

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "test_table")
data class Test(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val description: String,
    @ForeignKey(entity = Card::class, parentColumns = ["id"], childColumns = ["id", "description"], onDelete = ForeignKey.CASCADE)
    val card: Card
)
