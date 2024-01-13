package com.example.gridviewexcerciseapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var imageName = arrayOf("image1","image2","image3","image4")
    private var imageIds = intArrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView: GridView = findViewById(R.id.gridView)
        val imageAdapter = ImageAdapter(this, imageName, imageIds)
        gridView.adapter = imageAdapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, ImageExpandActivity::class.java)
            intent.putExtra("ImageId", imageIds[position])
            intent.putExtra("ImageName", imageName[position])
            startActivity(intent)
        }
    }
}
