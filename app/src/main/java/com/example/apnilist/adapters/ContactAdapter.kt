package com.example.apnilist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.apnilist.databinding.ContactItemBinding
import com.example.apnilist.tables.Contact

class ContactAdapter(var context: Context,var contactList:ArrayList<Contact> ,var function: (position:Int) -> Unit) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>(){

    inner class ViewHolder(var binding :ContactItemBinding):RecyclerView.ViewHolder(binding.root)

//    companion object{
//        private val CALLBACK:DiffUtil.ItemCallback<Contact> =
//            object : DiffUtil.ItemCallback<Contact>(){
//                override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
//                    return oldItem.id==newItem.id
//                }
//
//                override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
//                    return newItem.id==oldItem.id && newItem.name==oldItem.name && newItem.email==oldItem.email && newItem.number==oldItem.number
//                }
//            }
//
//
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding =  ContactItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.binding.name.text=getItem(position).name
//        holder.binding.number.text=getItem(position).id.toString()


        holder.itemView.setOnClickListener {
            function(position)
        }


    }

}