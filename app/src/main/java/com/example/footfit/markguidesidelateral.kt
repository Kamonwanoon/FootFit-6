package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class markguidesidelateral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.markguidesidelateral)

        val next = findViewById<Button>(R.id.backTocmarks4)
        next.setOnClickListener {
            val intent = Intent(this,marksidelateral::class.java)
            startActivity(intent)
        }

    }
}
