package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TubuhActivity2 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tubuh2)

        val tbkembali = findViewById<ImageButton>(R.id.kmbl)
        val kpl = findViewById<ImageButton>(R.id.kpl)
        val rambut = findViewById<ImageButton>(R.id.rambut)
        val  mata = findViewById<ImageButton>(R.id.mata)
        val  hidung = findViewById<ImageButton>(R.id.hidung)
        val  pipi = findViewById<ImageButton>(R.id.pipi)
        val mulut = findViewById<ImageButton>(R.id.mulut)
        val gigi = findViewById<ImageButton>(R.id.gigi)
        val lidah = findViewById<ImageButton>(R.id.lidah)
        val  telinga= findViewById<ImageButton>(R.id.telinga)
        val  tangan= findViewById<ImageButton>(R.id.tangan)
        val  kaki = findViewById<ImageButton>(R.id.kaki)


        tbkembali.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }
        kpl.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kepala)
            mediaPlayer.start()
            kpl.isEnabled = false
            kpl.isEnabled = true
        }

        rambut.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.rambut)
            mediaPlayer.start()
            rambut.isEnabled = false
            rambut.isEnabled = true
        }

            mata.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.mata)
                mediaPlayer.start()
                    mata.isEnabled = false
                    mata.isEnabled = true
            }

            hidung.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hidung)
                mediaPlayer.start()
                    hidung.isEnabled = false
                    hidung.isEnabled = true
            }

            pipi.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.pipi)
                mediaPlayer.start()
                    pipi.isEnabled = false
                    pipi.isEnabled = true
            }

            mulut.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.mulut)
                mediaPlayer.start()
                    mulut.isEnabled = false
                    mulut.isEnabled = true
            }

            gigi.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.gigi)
                mediaPlayer.start()
                    gigi.isEnabled = false
                    gigi.isEnabled = true
            }

            lidah.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lidah)
                mediaPlayer.start()
                    lidah.isEnabled = false
                    lidah.isEnabled = true
            }

            telinga.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.telinga)
                mediaPlayer.start()
                    telinga.isEnabled = false
                    telinga.isEnabled = true
            }

            tangan.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tangan)
                mediaPlayer.start()
                    tangan.isEnabled = false
                    tangan.isEnabled = true
            }

            kaki.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kaki)
                mediaPlayer.start()
                    kaki.isEnabled = false
                    kaki.isEnabled = true
            }
    }
}