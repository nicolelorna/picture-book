package com.nicolelornapicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tomatoe.*

class Tomatoe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tomatoe)

        to_capsicum.setOnClickListener {
            startActivity(Intent(this, Capsicum::class.java))
        }
    }
}