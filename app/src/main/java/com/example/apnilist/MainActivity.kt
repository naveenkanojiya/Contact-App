package com.example.apnilist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnilist.tables.Contact

class MainActivity : AppCompatActivity() {

    var name : String = "My NAme is Naveen KAnojiya"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CreateDb.createDb(this).dao().insertData(
            Contact(name = "Naveen Kanojiya",
                number = "9956794927",
                email = "naveen@1234")


        )
    }
}