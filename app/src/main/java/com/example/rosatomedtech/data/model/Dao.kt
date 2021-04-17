package com.example.rosatomedtech.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.objects.Student

@Dao
interface Dao {

    @Query("SELECT * FROM card_table ORDER BY id ASC")
    fun readAllCards(): LiveData<List<CardStackInfo>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCard(card: CardStackInfo)
}