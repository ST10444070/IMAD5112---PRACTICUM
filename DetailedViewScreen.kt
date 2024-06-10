package com.example.splashscreen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

private fun <T> Array<T>.average(function: () -> Unit) {

}

class DetailedViewScreen : AppCompatActivity() {
    private fun EditText(averageNumber: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)
        //Declaring and initialising
        val txtDetails = findViewById<EditText>(R.id.DayDetail)
        val txtAverage = findViewById<EditText(R.id.AverageNumber)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        val min = arrayOf("12", "15", "13", "11", "16", "10", "10")
        val max = arrayOf("25", "29", "26", "23", "30", "18", "16")
        val weatherCondition =
            arrayOf("Sunny", "Sunny", "Sunny", "Sunny", "Sunny", "Raining", "Cold")

        intent.getStringExtra("day")
        intent.getStringExtra("Min")
        intent.getStringExtra("Max")
        intent.getStringExtra("WeatherCondition")

        var details = ""
        for (i in days.indices) {
            details += "Day: ${days[i]}\n"
            details += "Min: ${min[i]}\n"
            details += "Max: ${max[i]}\n"
            details += "WeatherCondition: ${weatherCondition.getOrNull(i) ?: "N/A"}\n\n"
        }
        val details: String = txtDetails.text.toString()

        val averageMin = min.average()
        val averageMax = max.average() {
            txtAverage.text = "Average Min: ${"%.2f.format(averageMin)}\n" + "Average Max: ${"%.2f.format(averageMax)}\n"}"
                
            btnBack.setOnClickListener {
                finish()
            }
        }"
    }
}
