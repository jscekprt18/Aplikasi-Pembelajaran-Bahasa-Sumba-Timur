package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AktifActivity2 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktif2)
        val  bljr = findViewById<ImageButton>(R.id.bljr)
        val  bcr = findViewById<ImageButton>(R.id.bcr)
        val  lari = findViewById<ImageButton>(R.id.lari)
        val  main = findViewById<ImageButton>(R.id.main)
        val  mnd = findViewById<ImageButton>(R.id.mdn)
        val  msk = findViewById<ImageButton>(R.id.msk)
        val kmbl90 = findViewById<ImageButton>(R.id.kmbl90)

        kmbl90.setOnClickListener {
            val intent = Intent(this, AktifActivity::class.java)
            startActivity(intent)
        }


            bljr.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.belajar)
                mediaPlayer.start()
                    bljr.isEnabled = false
                    bljr.isEnabled = true
            }

                bcr.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bicara)
                    mediaPlayer.start()
                        bcr.isEnabled = false
                        bcr.isEnabled = true
                }


                lari.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lari)
                    mediaPlayer.start()
                        lari.isEnabled = false
                        lari.isEnabled = true
                }


                main.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.main)
                    mediaPlayer.start()
                        main.isEnabled = false
                        main.isEnabled = true
                }


                mnd.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.mandi)
                    mediaPlayer.start()
                        mnd.isEnabled = false
                        mnd.isEnabled = true
                }


                msk.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.masak)
                    mediaPlayer.start()
                        msk.isEnabled = false
                        msk.isEnabled = true
                }

    }
}