package com.example.footfit.model

import android.graphics.Bitmap

class ImagesModel(name: String, image: Bitmap?) {
    private var name: String = name
    private var image: Bitmap? = image

    public fun getName(): String {
        return name
    }

    public fun setName(name: String) {
        this.name = name
    }

    public fun getImage(): Bitmap? {
        return image
    }

    public fun setImage(image: Bitmap) {
        this.image = image
    }

}