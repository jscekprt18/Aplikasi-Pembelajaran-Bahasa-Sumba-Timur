package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class HewanActivity3 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan3)


        val home8 = findViewById<ImageButton>(R.id.home8)
        val bebek = findViewById<ImageButton>(R.id.bebek)
        val buaya = findViewById<ImageButton>(R.id.buaya)
        val ayam = findViewById<ImageButton>(R.id.ayam)
        val belalang = findViewById<ImageButton>(R.id.belalang)
        val mundur8 = findViewById<ImageButton>(R.id.mundur8)
        val maju7  = findViewById<ImageButton>(R.id.maju7)


        home8.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        mundur8.setOnClickListener {
            val intent = Intent(this, HewanActivity2::class.java)
            startActivity(intent)
        }

        maju7.setOnClickListener {
            val intent = Intent(this, HewanActivity4::class.java)
            startActivity(intent)
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.renji)
            .into(bebek)

            bebek.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bebek)
                mediaPlayer.start()
                    bebek.isEnabled = false
                    bebek.isEnabled = true
            }

        Glide.with(this)
            .asGif()
            .load(R.drawable.manu)
            .into(ayam)

            ayam.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ayam)
                mediaPlayer.start()
                    ayam.isEnabled = false
                    ayam.isEnabled = true
            }

        Glide.with(this)
            .asGif()
            .load(R.drawable.wuya)
            .into(buaya)

            buaya.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.buaya)
                mediaPlayer.start()
                    buaya.isEnabled = false
                    buaya.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.belalang1)
            .into(belalang)

            belalang.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.belalang)
                mediaPlayer.start()
                    belalang.isEnabled = false
                    belalang.isEnabled = true
            }
    }
}