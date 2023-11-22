package com.bignerdranch.android.rentcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private lateinit var numberHours: EditText
    private lateinit var auto: RadioButton
    private lateinit var van: RadioButton
    private lateinit var bus: RadioButton
    private lateinit var okButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberHours = findViewById(R.id.numberHours)
        auto = findViewById(R.id.auto)
        van = findViewById(R.id.van)
        bus = findViewById(R.id.bus)
        okButton = findViewById(R.id.okButton)

        okButton.setOnClickListener{
            val hours = numberHours.text.toString().toIntOrNull()
        val car = when {
            auto.isChecked -> 2000
            van.isChecked -> 2500
            bus.isChecked -> 3000
            else -> 0
        }
            if(hours != null) {
                val result = hours * car
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("result", result)
                }
                startActivity(intent)
            }
        }

    }
}


