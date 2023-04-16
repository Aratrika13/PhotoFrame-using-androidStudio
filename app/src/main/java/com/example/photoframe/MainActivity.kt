package com.example.photoframe

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var imageno=0
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val prev=findViewById<ImageView>(R.id.imgprev)
        val next = findViewById<ImageView>(R.id.imgnext)
        prev.setOnClickListener{
            val idcurrentImageString = "pic$imageno"
            val idCurrentImageInt = this.resources.getIdentifier(idcurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            imageno = (4+imageno-1)%4
            val idShowImageString = "pic$imageno"
            val idShowImageInt = this.resources.getIdentifier(idShowImageString,"id",packageName)
            image = findViewById(idShowImageInt)
            image.alpha = 1f

        }
        next.setOnClickListener{
            val idcurrentImageString = "pic$imageno"
            val idCurrentImageInt = this.resources.getIdentifier(idcurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            imageno = (4+imageno+1)%4
            val idShowImageString = "pic$imageno"
            val idShowImageInt = this.resources.getIdentifier(idShowImageString,"id",packageName)
            image = findViewById(idShowImageInt)
            image.alpha = 1f

        }
    }
}