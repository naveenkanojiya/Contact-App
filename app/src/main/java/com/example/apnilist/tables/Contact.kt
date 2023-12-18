package com.example.apnilist.tables

import androidx.room.Entity
import java.util.Date

@Entity(tableName = "contact_table")
data class Contact (
    var id:Int,

    var name:String,

    var number: String,

    var email : String,

    var dob: Date,


)