package com.example.apnilist.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnilist.R
import com.example.apnilist.databinding.ActivityAddUpdateBinding
import com.example.apnilist.databinding.ActivityMainBinding

class AddUpdateActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityAddUpdateBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {

        }
        binding.addBtn.setOnClickListener {

        }


    }
}