package com.example.aplikacian1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberToChange: TextView = findViewById(R.id.TW_numbers)
        val plusButton: Button = findViewById(R.id.BTN_plus)
        val minusButton: Button = findViewById(R.id.BTN_minus)
        val congratsText:TextView = findViewById(R.id.TW_congratsText)



        var count = 0

        plusButton.setOnClickListener {
            count += 1
            numberToChange.text = count.toString()
            if (count > 50){
                Toast.makeText(this,"congrats!", Toast.LENGTH_SHORT).show()
                count = 50
                numberToChange.text = "50"
                congratsText.text = "you are a good booy!"
            }
        }

        minusButton.setOnClickListener {
            count -= 1
            numberToChange.text = count.toString()
            if (count < 0){
                Toast.makeText(this,"cant go below zero", Toast.LENGTH_SHORT).show()
                count = 0
                numberToChange.text = "0"
            }
        }


    }
}