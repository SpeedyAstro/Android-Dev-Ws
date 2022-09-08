package com.example.recyclerdemo1

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerdemo1.Adapter.ItemAdapter
import com.example.recyclerdemo1.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAcids()
        val recyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        recyclerView.adapter = ItemAdapter(this,myDataset)
    }
//    private fun setUpAminoAcidModels(){
////        val aminoAcidNames = this.resources.getStringArray(R.array.amino_Acid)
////        val aminoAcidAbbrevation = this.resources.getStringArray(R.array.one_letter)
//
//
//    }
}