package com.nicolelornapicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Hiding the toolbar to make the App Look Good
        supportActionBar!!.hide()

        //Creating A clicklistener to start tour button
        btn_start_tour.setOnClickListener {

            startActivity(Intent(this, Kales::class.java))
        }
    }
}