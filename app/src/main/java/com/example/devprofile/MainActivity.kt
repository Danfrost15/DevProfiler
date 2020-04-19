package com.example.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val Rounded = RoundedBitmapDrawableFactory.create(resources,Bitmap)
        Rounded.cornerRadius = 20f
        Logo.setImageDrawable(Rounded)
    }
}
