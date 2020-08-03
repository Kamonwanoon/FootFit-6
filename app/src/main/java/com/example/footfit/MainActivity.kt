package com.example.footfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.blogspot.atifsoftwares.takepicture_kotlin.R



class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.guideline)
            val next = findViewById<Button>(R.id.nextguideline1)
            next.setOnClickListener {
                val intent = Intent(this,option::class.java)
                startActivity(intent)
            }
        }



}