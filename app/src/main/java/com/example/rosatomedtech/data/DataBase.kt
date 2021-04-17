package com.example.rosatomedtech.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rosatomedtech.data.model.MVPDataModel
import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.objects.Student

@Database(entities = [Student::class, CardStackInfo::class], version = 1, exportSchema = false)
abstract class DataBase: RoomDatabase() {

    abstract fun MVPDataModel(): MVPDataModel

    companion object{
        @Volatile
        private var INSTANCE: DataBase? = null

        fun getDataBase(context: Context): DataBase{
            val temp_instance = INSTANCE
            if(temp_instance != null){
                return temp_instance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "DataBase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}