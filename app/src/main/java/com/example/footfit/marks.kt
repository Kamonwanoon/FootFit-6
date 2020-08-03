package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class marks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.marks)

        val next = findViewById<TextView>(R.id.clickTguid2)
        next.setOnClickListener {
            val intent = Intent(this,markguide::class.java)
            startActivity(intent)
        }

        val next1 = findViewById<Button>(R.id.GTcheckimage)
        next1.setOnClickListener {
            val intent = Intent(this,checkimage::class.java)
            startActivity(intent)
        }

    }
}
