package com.example.utswilly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailYamahaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_yamaha)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val yamaha = intent.getParcelableExtra<Yamaha>(MainActivity.INTENT_PARCELABLE)

        val imgYamaha = findViewById<ImageView>(R.id.img_item_photo)
        val nameYamaha = findViewById<TextView>(R.id.tv_item_name)
        val descYamaha = findViewById<TextView>(R.id.tv_item_description)

        imgYamaha.setImageResource(yamaha?.imgYamaha!!)
        nameYamaha.text = yamaha.nameYamaha
        descYamaha.text = yamaha.descriptionYamaha
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}