package com.example.gridviewexcerciseapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.marginLeft

class ImageAdapter(private val context: Context,private val numberInWords:Array<String>,private val numberImage: IntArray):BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var imageName: TextView

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView
        var layoutInflater: LayoutInflater? = null
        if (convertView == null) {
            if (layoutInflater == null) {
                layoutInflater =
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            }
            if (convertView == null) {
                convertView = layoutInflater!!.inflate(R.layout.image_sample, null)
            }
            imageView = convertView!!.findViewById(R.id.imageView)
            imageName = convertView!!.findViewById(R.id.imageName)
            imageView.setImageResource(numberImage[position])
            imageName.text = numberInWords[position]
            return convertView
        }
        return convertView
    }

    override fun getItem(position: Int): Any {
        return numberImage[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return numberImage.size
    }

}
