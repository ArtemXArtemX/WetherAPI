package com.bignerdranch.android.wetherapi.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.wetherapi.DayItem
import com.bignerdranch.android.wetherapi.adapters.WeatherModel

@Database(entities = [ WeatherModel::class ], version=1)
@TypeConverters(WeatherTypeConverters::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun getDao(): WeatherDao
    companion object{
        fun getDb(context: Context): WeatherDatabase{
            return Room.databaseBuilder(
                context.applicationContext,
                WeatherDatabase::class.java,
                "weatherDataBase.db"
            ).build()
        }
    }
}