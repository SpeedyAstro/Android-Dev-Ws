package com.example.recyclerdemo2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val context: Context, val contacts: List<Person>) : RecyclerView.Adapter<ContactsAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val tvName = view.findViewById<TextView>(R.id.personName)
        val tvAge = view.findViewById<TextView>(R.id.personAge)
        fun bind(contact : Person){
            tvName.text = contact.name
            tvAge.text = contact.Age.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ItemViewHolder(adapterLayout)
    }
    // Bind the data at position into the view holder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }
    // return the size of data
    override fun getItemCount(): Int {
        return contacts.size
    }
}
