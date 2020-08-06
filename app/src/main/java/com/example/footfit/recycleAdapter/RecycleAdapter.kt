package com.example.footfit.recycleAdapter

import android.graphics.Bitmap
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.atifsoftwares.takepicture_kotlin.R
import com.example.footfit.Maker
import com.example.footfit.model.ImagesModel
import kotlinx.android.synthetic.main.image_fragment.view.*
import java.io.ByteArrayOutputStream
import java.util.*

class RecycleAdapter(private var items: ArrayList<ImagesModel>, var app: AppCompatActivity) :
    RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            (LayoutInflater.from(parent.context).inflate(R.layout.image_fragment, parent, false))
        )
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], position, app)
    }

    class ViewHolder(itemsView: View) : RecyclerView.ViewHolder(itemsView) {
        fun bind(item: ImagesModel, position: Int, app: AppCompatActivity) {
            itemView.apply {
                when (position % 2 == 0) {
                    true -> card.setBackgroundResource(R.drawable.box)
                    false -> card.setBackgroundResource(R.drawable.box1)
                }
                image_text.text = item.getName()
                imageView.setImageBitmap(item.getImage())
                mark_button.setOnClickListener {
                    app.startActivity(Maker.getLaunchIntent(app, item))
                }
            }
        }
    }
}