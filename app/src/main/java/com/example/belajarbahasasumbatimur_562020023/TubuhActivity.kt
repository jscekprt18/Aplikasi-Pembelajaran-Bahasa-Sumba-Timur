package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TubuhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tubuh)

        val majubtn = findViewById<ImageButton>(R.id.m5)
        val mundurbtn = findViewById<ImageButton>(R.id.md5)

        majubtn.setOnClickListener {
            val intent = Intent(this, TubuhActivity2::class.java)
            startActivity(intent)
        }

        mundurbtn.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

    }
}