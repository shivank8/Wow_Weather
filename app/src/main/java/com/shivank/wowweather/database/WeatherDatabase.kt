package com.internshala.bookhub.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shivank.wowweather.database.WeatherDao


@Database(entities = [WeatherEntity::class], version = 1)
abstract class WeatherDatabase: RoomDatabase() {

    abstract fun bookDao(): WeatherDao

}

