package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TempatActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tempat)

        val  sungai = findViewById<ImageButton>(R.id.sungai)
        val laut  = findViewById<ImageButton>(R.id.laut)
        val  gunung = findViewById<ImageButton>(R.id.gunung)
        val  hutan = findViewById<ImageButton>(R.id.hutan)
        val  lembah = findViewById<ImageButton>(R.id.lembah)
        val  jalan = findViewById<ImageButton>(R.id.jalan)
        val sekolah  = findViewById<ImageButton>(R.id.sekolah)
        val  rumah = findViewById<ImageButton>(R.id.rumah)
        val balik3  = findViewById<ImageButton>(R.id.balik3)

        balik3.setOnClickListener {
                val intent = Intent(this, BelajarActivity2::class.java)
                startActivity(intent)
            }


            sungai.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sungai)
                mediaPlayer.start()
                    sungai.isEnabled = false
                    sungai.isEnabled = true
            }

            laut.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.laut)
                mediaPlayer.start()
                    laut.isEnabled = false
                    laut.isEnabled = true
            }

            gunung.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.gunung)
                mediaPlayer.start()
                    gunung.isEnabled = false
                    gunung.isEnabled = true
            }

            hutan.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hutan)
                mediaPlayer.start()
                    hutan.isEnabled = false
                    hutan.isEnabled = true
            }

            lembah.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lembah)
                mediaPlayer.start()
                    lembah.isEnabled = false
                    lembah.isEnabled = true
            }

            jalan.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.jalan)
                mediaPlayer.start()
                    jalan.isEnabled = false
                    jalan.isEnabled = true
            }

            rumah.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.rumah)
                mediaPlayer.start()
                    rumah.isEnabled = false
                    rumah.isEnabled = true
            }

            sekolah.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sekolah)
                mediaPlayer.start()
                    sekolah.isEnabled = false
                    sekolah.isEnabled = true
            }

    }
}