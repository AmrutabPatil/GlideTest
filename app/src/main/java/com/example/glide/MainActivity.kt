package com.example.glide


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val media="https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
        Glide.with(this)
            .load(media)
            .into(imageview)

    }
}

