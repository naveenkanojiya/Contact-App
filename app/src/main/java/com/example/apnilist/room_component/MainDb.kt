package com.example.apnilist.room_component

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.apnilist.tables.Contact

@Database(entities = arrayOf(Contact::class), version = 1, exportSchema = false)
 abstract class MainDb : RoomDatabase(){
     abstract fun dao() : Dao

}