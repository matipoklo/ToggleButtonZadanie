package com.fpp.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttons = arrayOf(
            findViewById<ToggleButton>(R.id.toggleButton1),
            findViewById<ToggleButton>(R.id.toggleButton2),
            findViewById<ToggleButton>(R.id.toggleButton3),
            findViewById<ToggleButton>(R.id.toggleButton4),
            findViewById<ToggleButton>(R.id.toggleButton5),
            findViewById<ToggleButton>(R.id.toggleButton6)
        )
        

    }
}