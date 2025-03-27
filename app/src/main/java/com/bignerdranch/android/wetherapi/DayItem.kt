package com.bignerdranch.android.wetherapi

data class DayItem(
    val id: Int? = null,

    val city: String,

    val time: String,

    val condition: String,

    val imageUrl: String,

    val currentTemp: String,

    val maxTemp: String,

    val minTemp: String,

    val hours: String
)