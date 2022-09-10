package com.example.dobclac

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private var tvDate : TextView? = null
    private var tvsetMin : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvDate = findViewById(R.id.tvDateset)
        val btnDatePicker : Button = findViewById(R.id.button)
        tvsetMin = findViewById(R.id.tvsetMin)
        btnDatePicker.setOnClickListener {
            datePicker()
        }
    }

    private fun datePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(this , DatePickerDialog.OnDateSetListener { _, year, month, dateOfMonth -> Toast.makeText(this,"Selected $dateOfMonth/${month+1}/$year" , Toast.LENGTH_LONG ).show()
            val selectedDate = "$dateOfMonth/${month+1}/$year"
            tvDate?.text = selectedDate

            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            val theDate = sdf.parse(selectedDate)
            theDate?.let {
                val selectedDateInMinutes = theDate.time / 60000
                val currenDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                currenDate?.let {
                    val currentDateInMinutes =  currenDate.time/60000
                    val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes
                    tvsetMin?.text = differenceInMinutes.toString()
                }
            }


         }  , year , month , day)
        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()
    }
}