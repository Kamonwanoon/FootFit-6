package com.example.footfit

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import com.example.footfit.model.ImagesModel
import kotlinx.android.synthetic.main.option.*
import java.util.function.Predicate

class option : AppCompatActivity() {

    private lateinit var footComponentsChoice: Spinner
    lateinit var rest: TextView
    private lateinit var flashChoice: Spinner
    lateinit var rest2: TextView

    private var imageList: ArrayList<ImagesModel> = ArrayList()
    private lateinit var name: String
    private var flashFlag: Boolean = false

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option)
        setOnclick()
        footComponentsChoice = mySpinner
        flashChoice = mySpinner2
        var opts = arrayOf("Left Sole", "Right Sole", "Left Medial", "Right Medial")
        var opts2 = arrayOf("Flash", "Not Flash")
        footComponentsChoice.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opts)
        flashChoice.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opts2)

        footComponentsChoice.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                rest.text = "Please select part of foot"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                showImage()
            }
        }


        flashChoice.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                rest2.text = "Type of image"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                flashFlag = flashChoice.selectedItem.toString() != "Not Flash"
                showImage()
            }
        }
    }

    private fun showImage() {
        var name: String = footComponentsChoice.selectedItem.toString()
        var list: List<ImagesModel> =
            imageList.filter { imagesModel -> imagesModel.getName() == name && imagesModel.getFlash() == flashFlag}
        if (list.isNotEmpty()) {
            footView.setImageBitmap(list[0].getImage())
            retake.text = "retake"
        } else {
            footView.setImageDrawable(this.getDrawable(R.drawable.box1))
            retake.text = "take"
        }

    }

    private fun setOnclick() {
        retake.setOnClickListener {

            dispatchTakePictureIntent()
        }
        GTcheckimage.setOnClickListener {
            checkimage.getLaunchIntent(this, imageList)
            val intent = Intent(this, checkimage::class.java)
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
            var name: String = footComponentsChoice.selectedItem.toString()
            flashFlag = flashChoice.selectedItem.toString() != "Not Flash"

            val condition: Predicate<ImagesModel> =
                Predicate { image -> image.getName() == name && image.getFlash() == flashFlag}
            imageList.removeIf(condition)
            imageList.add(ImagesModel(name, imageBitmap, flashFlag))
            showImage()
        }
    }


}