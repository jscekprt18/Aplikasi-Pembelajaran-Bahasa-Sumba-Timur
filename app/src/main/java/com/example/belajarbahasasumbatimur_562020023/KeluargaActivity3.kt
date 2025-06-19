package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class KeluargaActivity3 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga3)

        val home3 = findViewById<ImageButton>(R.id.home3)
        val kakl = findViewById<ImageButton>(R.id.kakl)
        val kakp = findViewById<ImageButton>(R.id.kakp)
        val maju3 = findViewById<ImageButton>(R.id.maju3)
        val mundur3 = findViewById<ImageButton>(R.id.mundur3)

        home3.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.ayami)
            .into(kakl)

        kakl.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kakl)
            mediaPlayer.start()
            kakl.isEnabled = false
            kakl.isEnabled = true
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.ayak)
            .into(kakp)

        kakp.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kakp1)
            mediaPlayer.start()
            kakp.isEnabled = false
            kakp.isEnabled = true
        }

        maju3.setOnClickListener {
            val intent =  Intent(this, KeluargaActivity4::class.java)
            startActivity(intent)
        }

        mundur3.setOnClickListener {
            val intent = Intent(this, KeluargaActivity2::class.java)
            startActivity(intent)
        }
    }
}