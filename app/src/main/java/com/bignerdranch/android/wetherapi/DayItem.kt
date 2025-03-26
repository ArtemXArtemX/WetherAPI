package com.bignerdranch.android.wetherapi

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
import java.util.concurrent.locks.Condition

@Entity
data class DayItem(@PrimaryKey val id: UUID = UUID.randomUUID(),
                   val city: String,
                   val time: String,
                   val condition: String,
                   val imageUrl: String,
                   val currentTemp: String,
                   val maxTemp: String,
                   val minTemp: String,
                   val hours: String
)