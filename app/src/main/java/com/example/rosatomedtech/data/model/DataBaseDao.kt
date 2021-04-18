package com.example.rosatomedtech.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.data.objects.Company
import com.example.rosatomedtech.data.objects.Student

@Dao
interface DataBaseDao {

    @Query("SELECT * FROM card_table ORDER BY id ASC")
    fun readAllCards(): LiveData<List<Card>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCard(card: Card)

    @Query("SELECT * FROM student_table ORDER BY id ASC")
    fun readAllStudents(): LiveData<List<Student>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addStudent(student: Student)

    @Query("SELECT * FROM company_table ORDER BY id ASC")
    fun readAllCompanies(): LiveData<List<Company>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCompany(company: Company)
}