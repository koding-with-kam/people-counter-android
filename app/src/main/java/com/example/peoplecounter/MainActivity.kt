package com.example.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnClickMe = findViewById<Button>(R.id.button)
        val btnText = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            btnText.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}