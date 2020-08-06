package com.example.footfit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import com.example.footfit.model.ImagesModel
import com.example.footfit.recycleAdapter.RecycleAdapter
import kotlinx.android.synthetic.main.checkimage.*

class checkimage : AppCompatActivity() {
    companion object{
        lateinit var images : ArrayList<ImagesModel>
        fun getLaunchIntent(from: Context, images: ArrayList<ImagesModel>) : Intent {
            this.images = images
            return Intent(from, MainActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkimage)
        setRecycleView()
    }
    private fun setRecycleView(){
        var imageAdapter = RecycleAdapter(ArrayList(images.filter { image -> image.getFlash() }), this)
        recycle_view.apply {
            layoutManager = GridLayoutManager(context, 1, GridLayoutManager.VERTICAL, false)
            isNestedScrollingEnabled = false
            adapter = imageAdapter
            onFlingListener= null
            imageAdapter.notifyDataSetChanged()
        }
    }
}
