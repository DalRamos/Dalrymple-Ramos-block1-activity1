package com.ramos.dalrymple.block1.p1.quiz

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var p1: EditText
    private lateinit var p2: EditText
    private lateinit var p3: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        p1 = findViewById(R.id.p1)
        p2 = findViewById(R.id.p2)
        p3 = findViewById(R.id.p3)
        resultTextView = findViewById(R.id.resultTextView)
    }

    fun calculateAverage(view: View) {
        val number1 = parseEditText(p1)
        val number2 = parseEditText(p2)
        val number3 = parseEditText(p3)

        if (number1 != null && number2 != null && number3 != null) {
            val average = (number1 + number2 + number3) / 3.0
            resultTextView.text = "Result: $average"
        } else {
            resultTextView.text = "Invalid input. Please enter valid numbers."
        }
    }

    fun clearValues(view: View) {
        p1.text.clear()
        p2.text.clear()
        p3.text.clear()
        resultTextView.text = "Result: "
    }

    private fun parseEditText(editText: EditText): Double? {
        return editText.text.toString().toDoubleOrNull()
    }
}
