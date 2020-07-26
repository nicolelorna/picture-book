package com.nicolelornapicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kales.*

class Kales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kales)

        to_cabbage.setOnClickListener {
            startActivity(Intent(this, Cabbage::class.java))
        }
    }
}