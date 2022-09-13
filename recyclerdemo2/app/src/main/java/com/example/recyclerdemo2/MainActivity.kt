package com.example.recyclerdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Person(val name :String , val Age : Int)
lateinit var contactList : RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Steps to Implement the Recycler View
        /*
        1. Define a model class to use as the data source
        2. Add Recycler view to activity
        3. Create a custom raw layout XML file to visualize the item
        4. Create a RecyclerView.adapter and ViewHolder to render the item
        5. Bind the adapter to data source to populate the RecyclerView
         */
        val contacts : List<Person> = createContacts()
        contactList = findViewById(R.id.ContactList)
        contactList.adapter = ContactsAdapter(this , contacts)
        contactList.layoutManager = LinearLayoutManager(this)


    }
    private fun createContacts(): List<Person>{
        val Contacts : MutableList<Person> = mutableListOf<Person>()
        for(i :Int in 1..100){
            Contacts.add(Person("Person $i",i))
        }
        return Contacts
    }
}