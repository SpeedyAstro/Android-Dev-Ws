package com.example.biggernumber

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnleft: Button = findViewById<Button>(R.id.btnLeft)
        val btnrgt: Button = findViewById<Button>(R.id.btnRight)
        val cl: ConstraintLayout = findViewById(R.id.constraint_Layout)
        btnleft.text = "12"
        btnrgt.text = "10"
        btnleft.setOnClickListener {
            checkAnswer(true,btnleft,btnrgt,cl)
        }
        btnrgt.setOnClickListener {
            checkAnswer(false,btnleft,btnrgt,cl)
        }
    }
    private fun checkAnswer(isLeftButtonSelected: Boolean,btnleft : Button,btnrgt : Button,cl : ConstraintLayout){
        val a = btnleft.text.toString().toInt()
        val b = btnrgt.text.toString().toInt()
        val isAnswer = if(isLeftButtonSelected) a>b else b>a
        if(isAnswer){
           // btnleft.setBackgroundColor(Color.GREEN)
            cl.setBackgroundColor(Color.GREEN)
            //Show a toast..
            Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show()
        }else{
           // btnleft.setBackgroundColor(Color.RED)
            cl.setBackgroundColor(Color.RED)
            Toast.makeText(this,"Incorrect!",Toast.LENGTH_SHORT).show()
        }
        btnleft.text = (1..20).random().toString()
    }
}
