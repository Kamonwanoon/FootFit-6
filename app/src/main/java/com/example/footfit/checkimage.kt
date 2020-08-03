package com.example.footfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R

class checkimage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkimage)

        val next = findViewById<Button>(R.id.pv_ls)
        next.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next3 = findViewById<Button>(R.id.pv_rs)
        next3.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next4 = findViewById<Button>(R.id.pv_lm)
        next4.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next5 = findViewById<Button>(R.id.pv_rm)
        next5.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next6 = findViewById<Button>(R.id.pv_ll)
        next6.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next7 = findViewById<Button>(R.id.pv_rl)
        next7.setOnClickListener {
            val intent = Intent(this,preview::class.java)
            startActivity(intent)
        }

        val next1 = findViewById<Button>(R.id.mk_ls)
        next1.setOnClickListener {
            val intent = Intent(this,marks::class.java)
            startActivity(intent)
        }

        val next8 = findViewById<Button>(R.id.mk_rs)
        next8.setOnClickListener {
            val intent = Intent(this,marks::class.java)
            startActivity(intent)
        }

        val next9 = findViewById<Button>(R.id.mk_lm)
        next9.setOnClickListener {
            val intent = Intent(this,markside::class.java)
            startActivity(intent)
        }

        val next10 = findViewById<Button>(R.id.mk_rm)
        next10.setOnClickListener {
            val intent = Intent(this,markside::class.java)
            startActivity(intent)
        }

        val next11 = findViewById<Button>(R.id.mk_ll)
        next11.setOnClickListener {
            val intent = Intent(this,marksidelateral::class.java)
            startActivity(intent)
        }

        val next12 = findViewById<Button>(R.id.mk_rl)
        next12.setOnClickListener {
            val intent = Intent(this,marksidelateral::class.java)
            startActivity(intent)
        }

        val next2 = findViewById<Button>(R.id.GTresult)
        next2.setOnClickListener {
            val intent = Intent(this,result::class.java)
            startActivity(intent)
        }

    }
}
