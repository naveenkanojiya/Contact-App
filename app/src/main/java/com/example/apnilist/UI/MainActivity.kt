package com.example.apnilist.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.apnilist.adapters.ContactAdapter
import com.example.apnilist.databinding.ActivityMainBinding
import com.example.apnilist.tables.Contact

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    var dataList = ArrayList<Contact>()
    lateinit var adapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        CreateDb.createDb(this).dao().insertData(
//            Contact(name = "Naveen Kanojiya",
//                number = "9956794927",
//                email = "naveen@1234")

        binding.contactRv.layoutManager = LinearLayoutManager(this,)
        adapter = ContactAdapter(this){
            dataList.removeAt(it)
        }
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        adapter.submitList(dataList)
        binding.contactRv.adapter=adapter


    }
}