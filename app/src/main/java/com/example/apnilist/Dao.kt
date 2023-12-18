package com.example.apnilist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.apnilist.tables.Contact


@Dao
interface Dao {

    @Query("SELECT * FROM contact_table")
    fun readData()

    @Insert(entity = Contact::class, onConflict = OnConflictStrategy.IGNORE)
    fun insertData()


    @Update
    fun updateData()

    @Delete
    fun deleteData()

}