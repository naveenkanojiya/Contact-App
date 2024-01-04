package com.example.apnilist.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.apnilist.Repository
import com.example.apnilist.room_component.CreateDb
import com.example.apnilist.room_component.Dao
import com.example.apnilist.tables.Contact

class AddUpdateActivityViewModal (var application: Application): AndroidViewModel(application)
{
    lateinit var dao: Dao
    lateinit var repository: Repository
    init {

        dao = CreateDb.createDb(application).dao()
        repository = Repository(dao)


    }
    fun insertData(contact: Contact){
        repository.insertData(contact)

    }

}