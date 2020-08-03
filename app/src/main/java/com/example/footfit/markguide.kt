package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class markguide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.markguide)

        val next = findViewById<Button>(R.id.backTocmarks2)
        next.setOnClickListener {
            val intent = Intent(this,marks::class.java)
            startActivity(intent)
        }

    }
}
