package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import kotlinx.android.synthetic.main.preview.*

class preview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preview)

        val next = findViewById<Button>(R.id.backTocmarks2)
        next.setOnClickListener {
            val intent = Intent(this,checkimage::class.java)
            startActivity(intent)
        }
        backTocamera.setOnClickListener {
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i, 126)
        }

    }

}