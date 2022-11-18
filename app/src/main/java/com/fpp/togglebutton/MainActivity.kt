package com.fpp.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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
        val klucz = intArrayOf(1,2,3,4,5,6);
        var numerDoKlucza = intArrayOf();
        buttons[0].setOnClickListener(){
            numerDoKlucza[0] = 1;
        }
        buttons[1].setOnClickListener(){
            numerDoKlucza[1] = 2;
        }
        buttons[2].setOnClickListener(){
            numerDoKlucza[2] = 3;
        }
        buttons[3].setOnClickListener(){
            numerDoKlucza[3] = 4;
        }
        buttons[4].setOnClickListener(){
            numerDoKlucza[4] = 5;
        }
        buttons[5].setOnClickListener(){
            numerDoKlucza[5] = 6;
        }
        //1 3 2 6 4 5
        if(numerDoKlucza == klucz){
            findViewById<TextView>(R.id.txtWynik).text = "Wynik: 1"
        }
    }
}