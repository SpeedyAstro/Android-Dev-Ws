package com.example.hellofromandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val username = intent.getStringExtra("User")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$username , you will get the free access to all the content for one month"
        textView.text = message
    }
}