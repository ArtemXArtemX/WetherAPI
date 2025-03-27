package com.bignerdranch.android.wetherapi.adapters

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wItems")
data class WeatherModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "city")
    val city: String,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "condition")
    val condition: String,
    @ColumnInfo(name = "currentTemp")
    val currentTemp: String,
    @ColumnInfo(name = "maxTemp")
    val maxTemp: String,
    @ColumnInfo(name = "minTemp")
    val minTemp: String,
    @ColumnInfo(name = "imageUrl")
    val imageUrl: String,
    @ColumnInfo(name = "hours")
    val hours: String
)