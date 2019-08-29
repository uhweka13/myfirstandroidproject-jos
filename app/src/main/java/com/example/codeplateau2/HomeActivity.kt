package com.example.codeplateau2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class HomeActivity : AppCompatActivity() {

    lateinit var gender : Spinner
    lateinit var statefrom :Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        gender = findViewById(R.id.gd_select) as Spinner
        statefrom = findViewById(R.id.st_select) as Spinner

        val genders = arrayOf("Gender","Male", "Female")
        val statefroms = arrayOf("Select State","Abia", "etc...")

        gender.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,genders)
        statefrom.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,statefroms)
    }



}
