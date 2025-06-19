package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WaktuActivity : AppCompatActivity() {
    private lateinit var mediaPlayer:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waktu)


        val besok = findViewById<ImageButton>(R.id.besok)
        val kemarin  = findViewById<ImageButton>(R.id.kemarin)
        val pagi  = findViewById<ImageButton>(R.id.pagi)
        val  siang = findViewById<ImageButton>(R.id.siang)
        val  sore = findViewById<ImageButton>(R.id.sore)
        val  malam = findViewById<ImageButton>(R.id.malam)
        val balik4  = findViewById<ImageButton>(R.id.balik4)


        balik4.setOnClickListener {
                val intent = Intent(this, BelajarActivity4::class.java)
                startActivity(intent)
            }


            besok.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.besok)
                mediaPlayer.start()
                    besok.isEnabled = false
                    besok.isEnabled = true
            }

                kemarin.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kemarin)
                    mediaPlayer.start()
                        kemarin.isEnabled = false
                        kemarin.isEnabled = true
                }

                pagi.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.pagi)
                    mediaPlayer.start()
                        pagi.isEnabled = false
                        pagi.isEnabled = true
                }

                siang.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.siang)
                    mediaPlayer.start()
                        siang.isEnabled = false
                        siang.isEnabled = true
                }

                sore.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sore)
                    mediaPlayer.start()
                        sore.isEnabled = false
                        sore.isEnabled = true
                }

                malam.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.malam)
                    mediaPlayer.start()
                        malam.isEnabled = false
                        malam.isEnabled = true
                }
    }
}