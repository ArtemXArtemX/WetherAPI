package com.bignerdranch.android.wetherapi.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.wetherapi.DayItem

@Database(entities = [ DayItem::class ], version=1)
@TypeConverters(WeatherTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): WeatherDao
}