package com.example.footfit

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import com.example.footfit.model.ImagesModel
import kotlinx.android.synthetic.main.activity_maker.*

class Maker : AppCompatActivity() {
    companion object{
        lateinit var image: ImagesModel
        fun getLaunchIntent(from: Context, image: ImagesModel) : Intent {
            this.image = image
            return Intent(from, Maker::class.java)

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maker)
        imageView.setImageBitmap(image.getImage())
    }
}