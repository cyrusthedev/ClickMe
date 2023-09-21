// this is a simple click counter

package com.cyrusthedev.clickme

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<TextView>(R.id.txt1)
        val btn1 = findViewById<Button>(R.id.btn1)
        var counter = 0

        btn1.setOnClickListener{
            counter += 1
            txt1.text = counter.toString()
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT)
        }
    }
}