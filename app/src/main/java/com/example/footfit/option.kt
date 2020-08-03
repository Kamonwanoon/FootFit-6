package com.example.footfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import kotlinx.android.synthetic.main.option.*

class option : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option)

        val next = findViewById<Button>(R.id.GTcheckimage)
        next.setOnClickListener {
            val intent = Intent(this,checkimage::class.java)
            startActivity(intent)
        }
        buttonls.setOnClickListener{
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i,120)
        }
        buttonrs.setOnClickListener{
            var j = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(j,121)
        }
        buttonlm.setOnClickListener{
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i,122)
        }
        buttonrm.setOnClickListener{
            var j = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(j,123)
        }
        buttonll.setOnClickListener{
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i,124)
        }
        buttonrl.setOnClickListener{
            var j = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(j,125)
        }
    }

//     override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//         super.onActivityResult(requestCode, resultCode, data)
//         if(requestCode==120) {
//            var bmp = data?.extras?.get("data") as Bitmap
//            buttonls.setImageBitmap(bmp)
//        }
//         else if (requestCode==121){
//             var bmp1 = data?.extras?.get("data") as Bitmap
//             buttonrs.setImageBitmap(bmp1)
//         }
//         else if (requestCode==122){
//             var bmp2 = data?.extras?.get("data") as Bitmap
//             buttonlm.setImageBitmap(bmp2)
//         }
//         else if (requestCode==123){
//             var bmp3 = data?.extras?.get("data") as Bitmap
//             buttonrm.setImageBitmap(bmp3)
//         }
//         else if (requestCode==124){
//             var bmp4 = data?.extras?.get("data") as Bitmap
//             buttonll.setImageBitmap(bmp4)
//         }
//         else if (requestCode==125){
//             var bmp5 = data?.extras?.get("data") as Bitmap
//             buttonrl.setImageBitmap(bmp5)
//         }
//    }

}