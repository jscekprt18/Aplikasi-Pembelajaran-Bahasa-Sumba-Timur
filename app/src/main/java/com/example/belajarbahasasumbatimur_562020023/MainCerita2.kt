package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainCerita2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cerita2)

        val kandunu = findViewById<ImageButton>(R.id.kandunu)
        val kerbau = findViewById<ImageButton>(R.id.kerbauu)
        val kem = findViewById<ImageButton>(R.id.kmbl0)


        kandunu.setOnClickListener {
            val intent = Intent(this, CeritaActivity::class.java)
            startActivity(intent)
        }

        kerbau.setOnClickListener {
            val intent = Intent (this, CeritaKerbau::class.java)
            startActivity(intent)
        }

        kem.setOnClickListener {
            val intent = Intent(this, MainCerita::class.java)
            startActivity(intent)
        }
    }
}