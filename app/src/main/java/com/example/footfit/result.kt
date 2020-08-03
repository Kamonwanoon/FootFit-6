package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val next = findViewById<Button>(R.id.finish)
        next.setOnClickListener {
            val intent = Intent(this,guideline::class.java)
            startActivity(intent)
        }
    }

}