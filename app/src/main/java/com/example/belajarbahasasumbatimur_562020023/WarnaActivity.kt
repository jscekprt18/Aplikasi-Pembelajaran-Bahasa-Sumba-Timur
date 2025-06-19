package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WarnaActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warna)

        val merah  = findViewById<ImageButton>(R.id.merah)
        val  kuning = findViewById<ImageButton>(R.id.kuning)
        val  hijau = findViewById<ImageButton>(R.id.hijau)
        val  biru = findViewById<ImageButton>(R.id.biru)
        val  hitam = findViewById<ImageButton>(R.id.hitam)
        val putih  = findViewById<ImageButton>(R.id.putih)
        val balik  = findViewById<ImageButton>(R.id.balik)


        balik.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

            merah.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.merah)
                mediaPlayer.start()
                    merah.isEnabled = false
                    merah.isEnabled = true
            }

            kuning.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kuning)
                mediaPlayer.start()
                    kuning.isEnabled = false
                    kuning.isEnabled = true
            }

            biru.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.biru)
                mediaPlayer.start()
                    biru.isEnabled = false
                    biru.isEnabled = true
            }

            hijau.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hijau)
                mediaPlayer.start()
                    hijau.isEnabled = false
                    hijau.isEnabled = true
            }

            hitam.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hitam)
                mediaPlayer.start()
                    hitam.isEnabled = false
                    hitam.isEnabled = true
            }

            putih.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.putih)
                mediaPlayer.start()
                    putih.isEnabled = false
                    putih.isEnabled = true
            }
    }
}