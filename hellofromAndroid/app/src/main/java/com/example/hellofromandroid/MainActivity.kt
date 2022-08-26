package com.example.hellofromandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val greetingTextView = findViewById<TextView>(R.id.tv_name)
            val inputField = findViewById<EditText>(R.id.ev_name)
            val submitbtn = findViewById<Button>(R.id.btnSubmit)
            val offersBtn = findViewById<Button>(R.id.btnOffers)
            var enteredName = ""
        submitbtn.setOnClickListener {
                enteredName = inputField.text.toString()
                if(enteredName==""){
                    offersBtn.visibility = INVISIBLE
                    greetingTextView.text = ""
                    Toast.makeText(
                        this@MainActivity,"Please enter your name!",
                        Toast.LENGTH_SHORT
                    ).show()
                }else {
                    val message = "Welcome $enteredName"
                    greetingTextView.text = message
                    inputField.text.clear()
                    offersBtn.visibility = VISIBLE
                }
            }
            offersBtn.setOnClickListener {
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("User",enteredName)
                startActivity(intent)
            }
    }
}