package com.example.footfit.model

import android.graphics.Bitmap

class ImagesModel(name: String, image: Bitmap?, flash: Boolean) {
    private var name: String = name
    private var image: Bitmap? = image
    private var flash: Boolean = flash

    fun getFlash(): Boolean{
        return flash
    }
    fun setFlash(flash: Boolean){
        this.flash = flash
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getImage(): Bitmap? {
        return image
    }

    fun setImage(image: Bitmap) {
        this.image = image
    }

}