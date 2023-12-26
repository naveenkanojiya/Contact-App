package com.example.apnilist.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.apnilist.databinding.ContactItemBinding
import com.example.apnilist.tables.Contact

class ContactAdapter(var context: Context, ) : ListAdapter<Contact,ContactAdapter.ViewHolder>(
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
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}