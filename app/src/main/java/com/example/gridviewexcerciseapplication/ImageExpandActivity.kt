package com.example.gridviewexcerciseapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ImageExpandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_expand)

        val intent = intent
        val imageId = intent.getIntExtra("ImageId", 0)
        val imageName = intent.getStringExtra("ImageName")

        val image = findViewById<ImageView>(R.id.image)
        val imagename = findViewById<TextView>(R.id.imagename)

        image.setImageResource(imageId)
        imagename.text = imageName
    }
}
