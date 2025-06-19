package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AlamActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alam)

        val matahari = findViewById<ImageButton>(R.id.matahari)
        val bulan = findViewById<ImageButton>(R.id.bulan)
        val bintang = findViewById<ImageButton>(R.id.bintang)
        val panas = findViewById<ImageButton>(R.id.panas)
        val dingin = findViewById<ImageButton>(R.id.dingin)
        val hujan = findViewById<ImageButton>(R.id.hujan)
        val angin = findViewById<ImageButton>(R.id.angin)
        val balik2 = findViewById<ImageButton>(R.id.balik2)

        balik2.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        matahari.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.matahari)
            mediaPlayer.start()
            matahari.isEnabled = false
            matahari.isEnabled = true
        }

        bulan.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bulan)
            mediaPlayer.start()
            bulan.isEnabled = false
            bulan.isEnabled = true
        }

        bintang.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bintang)
            mediaPlayer.start()
            bintang.isEnabled = false
            bintang.isEnabled = true
        }

        panas.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.panas)
            mediaPlayer.start()
            panas.isEnabled = false
            panas.isEnabled = true
        }

        dingin.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.dingin)
            mediaPlayer.start()
            dingin.isEnabled = false
            dingin.isEnabled = true
        }

        hujan.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hujan)
            mediaPlayer.start()
            hujan.isEnabled = false
            hujan.isEnabled = true
        }

        angin.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.angin)
            mediaPlayer.start()
            angin.isEnabled = false
            angin.isEnabled = true
                    }


    }
}