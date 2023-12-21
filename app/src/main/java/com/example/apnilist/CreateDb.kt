package com.example.apnilist

import android.content.Context
import androidx.room.Room

object CreateDb {

    var db: MainDb? = null
    fun createDb(context:Context):MainDb{
        if (db==null){
            db= Room.databaseBuilder(context,
                MainDb::class.java,
                "my_database.db").build()
        }
        return db!!
    }
}