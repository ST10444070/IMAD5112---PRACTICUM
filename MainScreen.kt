package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    @Suppress("UNUSED_VARIABLE")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        //Declaring and initialising
        val txtDay = findViewById<EditText>(R.id.Weekday)
        val txtMin = findViewById<EditText>(R.id.MinTempNumber)
        val txtMax = findViewById<EditText>(R.id.MaxTempNumber)
        val txtWeatherCondition = findViewById<EditText>(R.id.WeatherCondition)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnExit = findViewById<Button>(R.id.btnExit)

        val validDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val validMin = arrayOf("12", "15", "13", "11", "16", "10", "10")
        val validMax = arrayOf("25", "29", "26", "23", "30", "18", "16")
        val validWeatherCondition = arrayOf("Sunny", "Sunny", "Sunny", "Sunny", "Sunny", "Raining", "Cold")

        btnDisplay.setOnClickListener {
            val day = txtDay.text.toString()
            val Min = txtMin.text.toString()
            val Max = txtMax.text.toString()
            val WeatherCondition = txtWeatherCondition.toString()
            if (validDays.contains(day) && validMin.contains(Min) && validMax.contains(Max) && validWeatherCondition.contains(
                    WeatherCondition
                )
            ) {

                btnClear.setOnClickListener {
                    txtDay.text.clear()
                    txtMin.text.clear()
                    txtMax.text.clear()
                    txtMin.text.clear()
                }
                btnNext?.setOnClickListener {
                    val intent = Intent(this, DetailedViewScreen::class.java).apply {
                        putExtra("day", day)
                        putExtra("Min", Min)
                        putExtra("Max", Max)
                        putExtra("WeatherCondition", WeatherCondition)
                    }
                }
            }
        }
    }
}