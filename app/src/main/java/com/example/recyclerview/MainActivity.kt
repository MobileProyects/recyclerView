package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var contacts = ArrayList<Contact>()

    var contactAdapter = ContactAdapter(contacts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()

        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)

        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this)
    }


    private fun loadContacts() {
        contacts.add(Contact("Leo Messi", "994126830"))
        contacts.add(Contact("Cristiano Ronaldo", "987654321"))
        contacts.add(Contact("Neymar Jr.", "123456789"))
        contacts.add(Contact("Lionel Messi Jr.", "555555555"))
        contacts.add(Contact("Andrés Iniesta", "111111111"))
        contacts.add(Contact("Xavi Hernandez", "222222222"))
        contacts.add(Contact("Sergio Ramos", "333333333"))
        contacts.add(Contact("Gareth Bale", "444444444"))
        contacts.add(Contact("Karim Benzema", "555555555"))
        contacts.add(Contact("Antoine Griezmann", "666666666"))
        contacts.add(Contact("Kylian Mbappé", "777777777"))
        contacts.add(Contact("Eden Hazard", "888888888"))
        contacts.add(Contact("Mohamed Salah", "999999999"))
        contacts.add(Contact("Robert Lewandowski", "1010101010"))
        contacts.add(Contact("Manuel Neuer", "1212121212"))
    }
}