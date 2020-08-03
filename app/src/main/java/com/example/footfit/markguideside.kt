package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class markguideside : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.markguideside)

        val next = findViewById<Button>(R.id.backTocmarks3)
        next.setOnClickListener {
            val intent = Intent(this,markside::class.java)
            startActivity(intent)
        }

    }
}
