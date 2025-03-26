package com.bignerdranch.android.wetherapi.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.wetherapi.DayItem
import java.util.UUID
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {
    @Insert
    fun insertItem(item: DayItem)
    @Query("SELECT * FROM items")
    fun getAllItem(): Flow<List<DayItem>>
    @Query("SELECT * FROM items WHERE id=(:id)")
    fun getItem(id: UUID): LiveData<DayItem?>
    @Update
    fun updateItem(dayItem: DayItem)
    @Query("DELETE FROM items")
    fun deleteItem()

}