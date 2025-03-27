package com.bignerdranch.android.wetherapi.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.wetherapi.adapters.WeatherModel
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {
    @Insert
    fun insertItem(item: WeatherModel)
    @Query("SELECT * FROM wItems")
    fun getAllItem(): Flow<List<WeatherModel>>
    @Query("SELECT * FROM wItems WHERE id=(:id)")
    fun getItem(id: Int?): LiveData<WeatherModel?>
    @Update
    fun updateItem(dayItem: WeatherModel)
    @Query("DELETE FROM wItems")
    fun deleteItem()

}