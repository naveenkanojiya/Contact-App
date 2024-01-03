package com.example.apnilist.room_component

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
    fun readData():List<Contact>
    @Insert(entity = Contact::class, onConflict = OnConflictStrategy.IGNORE)
    fun insertData(contact: Contact)
    @Update
    fun updateData(contact: Contact)
    @Delete
    fun deleteData(contact: Contact)

}