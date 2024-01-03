package com.example.apnilist

import com.example.apnilist.room_component.Dao
import com.example.apnilist.tables.Contact

class Repository(var dao:Dao) {
    fun readData()= dao.readData()

    fun insertData(contact: Contact)= dao.insertData(contact)

    fun updateData(contact: Contact)= dao.updateData(contact)

    fun deleteData(contact: Contact)= dao.deleteData(contact)
}