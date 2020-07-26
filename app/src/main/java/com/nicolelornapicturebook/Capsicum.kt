package com.nicolelornapicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_capsicum.*

class Capsicum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capsicum)


        to_carrot.setOnClickListener {
            startActivity(Intent(this, Carrot::class.java))
        }
    }
}