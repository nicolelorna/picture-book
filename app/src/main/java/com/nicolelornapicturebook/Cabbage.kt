package com.nicolelornapicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cabbage.*

class Cabbage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cabbage)

        to_tomatoe.setOnClickListener {
            startActivity(Intent(this, Tomatoe::class.java))
        }
    }
}