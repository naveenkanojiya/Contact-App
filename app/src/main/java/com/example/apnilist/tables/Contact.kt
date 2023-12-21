package com.example.apnilist.tables

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "contact_table")
data class Contact (

   @PrimaryKey(autoGenerate = true) var id:Int? = null,

    var name:String,

    var number: String,

    var email : String,

//    var dob: Date,


)