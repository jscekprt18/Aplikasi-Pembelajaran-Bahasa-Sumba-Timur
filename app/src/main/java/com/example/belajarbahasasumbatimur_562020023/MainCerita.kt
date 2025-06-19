package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainCerita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cerita)

        val kabihu = findViewById<ImageButton>(R.id.kabihu)
        val ayam1 = findViewById<ImageButton>(R.id.ayam1)
        val suanggi = findViewById<ImageButton>(R.id.suanggi)
        val elang1 = findViewById<ImageButton>(R.id.elang1)
        val kmbli = findViewById<ImageButton>(R.id.kmbl00)
        val lanjutt = findViewById<ImageButton>(R.id.lnjt00)

        kabihu.setOnClickListener {
            val intent = Intent(this, CeritaKabihu::class.java)
            startActivity(intent)
        }

        ayam1.setOnClickListener {
            val intent =Intent(this, CeritaAyam::class.java)
            startActivity(intent)
        }

        suanggi.setOnClickListener {
            val intent = Intent(this, CeritaSuanggi::class.java)
            startActivity(intent)
        }
        elang1.setOnClickListener {
            val intent = Intent(this, CeritaElang::class.java)
            startActivity(intent)
        }
        kmbli.setOnClickListener {
            val intent = Intent(this, BelajarActivity4::class.java)
            startActivity(intent)
        }
        lanjutt.setOnClickListener {
            val intent = Intent(this, MainCerita2::class.java)
            startActivity(intent)
        }
    }
}