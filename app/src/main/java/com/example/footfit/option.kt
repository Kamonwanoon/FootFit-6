package com.example.footfit

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import com.example.footfit.model.ImagesModel
import kotlinx.android.synthetic.main.option.*

class option : AppCompatActivity() {
    private var imageList: ArrayList<ImagesModel> = ArrayList()
    private  lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option)
        setOnclick()
    }

    private fun setOnclick(){
        buttonls.setOnClickListener{
            name = "leftSole"
            dispatchTakePictureIntent()
        }
        buttonrs.setOnClickListener{
            name = "rightSole"
            dispatchTakePictureIntent()
        }
        buttonlm.setOnClickListener{
            name = "leftM"
            dispatchTakePictureIntent()
        }
        buttonrm.setOnClickListener{
            name = "rightM"
            dispatchTakePictureIntent()
        }
        GTcheckimage.setOnClickListener {
            checkimage.getLaunchIntent(this, imageList)
            val intent = Intent(this,checkimage::class.java)
            startActivity(intent)
        }
    }
    private val REQUEST_IMAGE_CAPTURE = 1
    //connect to device camera
    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(this.packageManager).also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
    //get picture after took a picture
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageList.add(ImagesModel(name, imageBitmap))
        }
    }


}