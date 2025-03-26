package com.bignerdranch.android.wetherapi.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.wetherapi.DayItem
import java.util.UUID

@Dao
interface WeatherDao {
    @Query("SELECT * FROM dayitem")
    fun getCrimes(): LiveData<List<DayItem>>
    @Query("SELECT * FROM dayitem WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<DayItem?>

    @Update
    fun updateCrime(crime: DayItem)
    @Insert
    fun addCrime(crime: DayItem)
}