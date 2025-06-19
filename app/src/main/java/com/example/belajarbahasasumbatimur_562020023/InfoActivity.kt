package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val back = findViewById<ImageButton>(R.id.bk)


        back.setOnClickListener {
            val intent = Intent(this, PilihActivity::class.java)
            startActivity(intent)
        }



    }
}