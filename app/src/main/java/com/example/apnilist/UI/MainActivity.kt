package com.example.apnilist.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnilist.databinding.ActivityMainBinding
import com.example.apnilist.tables.Contact

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        CreateDb.createDb(this).dao().insertData(
//            Contact(name = "Naveen Kanojiya",
//                number = "9956794927",
//                email = "naveen@1234")


    }
}