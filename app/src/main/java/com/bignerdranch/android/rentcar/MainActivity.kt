package com.bignerdranch.android.rentcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private  lateinit var numberHours: EditText
    private  lateinit var auto: RadioButton
    private  lateinit var van: RadioButton
    private  lateinit var bus: RadioButton
    private  lateinit var okButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okButton.setOnClickListener{
            val hours = numberHours.text.toString().toIntOrNull()
            val car = when {
                auto.isChecked -> 2000
                van.isChecked -> 2500
                bus.isChecked -> 3000
                else -> 0
            }


        }

    }
}