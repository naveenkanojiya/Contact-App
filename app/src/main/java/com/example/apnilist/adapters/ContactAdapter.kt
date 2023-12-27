package com.example.apnilist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.apnilist.databinding.ContactItemBinding
import com.example.apnilist.tables.Contact

class ContactAdapter(var context: Context, var function:(postion : Int)-> Unit ) : ListAdapter<Contact,ContactAdapter.ViewHolder>(
    CALLBACK){

    inner class ViewHolder(var binding :ContactItemBinding):RecyclerView.ViewHolder(binding.root)

    companion object{
        private val CALLBACK:DiffUtil.ItemCallback<Contact> =
            object : DiffUtil.ItemCallback<Contact>(){
                override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
                    return false
                }

                override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
                    return false
                }
            }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding =  ContactItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}