package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class KeluargaActivity4 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga4)

       val home4 = findViewById<ImageButton>(R.id.home4)
        val adil = findViewById<ImageButton>(R.id.adil)
        val adip = findViewById<ImageButton>(R.id.adip)
        val maju4 = findViewById<ImageButton>(R.id.maju4)
        val mundur4 = findViewById<ImageButton>(R.id.mundur4)




        home4.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.erim)
            .into(adil)

        adil.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.adil)
            mediaPlayer.start()
            adil.isEnabled = false
            adil.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.erik)
            .into(adip)

        adip.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.adip)
            mediaPlayer.start()
            adip.isEnabled = false
            adip.isEnabled = true
        }

        maju4.setOnClickListener {
            val intent =  Intent(this, KeluargaActivity5::class.java)
            startActivity(intent)
        }

        mundur4.setOnClickListener {
            val intent = Intent(this, KeluargaActivity3::class.java)
            startActivity(intent)
        }
    }
}