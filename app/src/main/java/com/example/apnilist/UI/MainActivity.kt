package com.example.apnilist.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apnilist.adapters.ContactAdapter
import com.example.apnilist.databinding.ActivityMainBinding
import com.example.apnilist.tables.Contact

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var adapter: ContactAdapter
    var dataList = ArrayList<Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.addNewNumber.setOnClickListener {
            startActivity(Intent(this@MainActivity,AddUpdateActivity::class.java))
        }

//        CreateDb.createDb(this).dao().insertData(
//            Contact(name = "Naveen Kanojiya",
//                number = "9956794927",
//                email = "naveen@1234")

        binding.contactRv.layoutManager = LinearLayoutManager(this)
        adapter = ContactAdapter(this, dataList){
            dataList.removeAt(it)
//            adapter.submitList(dataList)

        }

        dataList.add(Contact(2,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(3,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(4,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(5,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(6,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(7,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(8,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(9,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(10,"Naveen ","8424829482","bsdf@gami.com"))
        dataList.add(Contact(11,"Naveen ","8424829482","bsdf@gami.com"))
//        adapter.submitList(dataList)
//        binding.contactRv.adapter=adapter

        adapter.notifyDataSetChanged()


    }
}