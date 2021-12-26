package com.shivank.wowweather.database


import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.internshala.bookhub.database.WeatherEntity

@Dao
interface WeatherDao {

    @Insert
    fun insertBook(weatherEntity: WeatherEntity)

    @Delete
    fun deleteBook(weatherEntity: WeatherEntity)

    @Query("SELECT * FROM books")
    fun getAllBooks(): List<WeatherEntity>

    @Query("SELECT * FROM books WHERE book_id = :bookId")
    fun getBookById(bookId: String): WeatherEntity
}

