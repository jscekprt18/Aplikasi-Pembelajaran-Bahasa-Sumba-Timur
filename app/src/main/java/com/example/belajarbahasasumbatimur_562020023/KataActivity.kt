package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KataActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kata)

        val sa = findViewById<ImageButton>(R.id.saya)
        val ko  = findViewById<ImageButton>(R.id.kau)
        val  dia = findViewById<ImageButton>(R.id.dia)
        val  tong = findViewById<ImageButton>(R.id.kita)
        val  bb = findViewById<ImageButton>(R.id.bb)

        bb.setOnClickListener {
                val intent = Intent(this, BelajarActivity4::class.java)
                startActivity(intent)
            }


            sa.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.saya)
                mediaPlayer.start()
                    sa.isEnabled = false
                    sa.isEnabled = true
            }


                ko.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kamu)
                    mediaPlayer.start()
                        ko.isEnabled = false
                        ko.isEnabled = true
                }

                dia.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.dia)
                    mediaPlayer.start()
                        dia.isEnabled = false
                        dia.isEnabled = true
                }

                tong.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kita)
                    mediaPlayer.start()
                        tong.isEnabled = false
                        tong.isEnabled = true
                }
    }
}