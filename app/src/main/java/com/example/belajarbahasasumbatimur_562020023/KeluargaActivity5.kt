package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class KeluargaActivity5 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga5)

        val home5 = findViewById<ImageButton>(R.id.home5)
        val om = findViewById<ImageButton>(R.id.om)
        val tante = findViewById<ImageButton>(R.id.tante)
        val mundur5 = findViewById<ImageButton>(R.id.mundur5)

        home5.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.tuya)
            .into(om)

        om.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.om)
            mediaPlayer.start()
            om.isEnabled = false
            om.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.mamu)
            .into(tante)

        tante.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tante)
            mediaPlayer.start()
            tante.isEnabled = false
            tante.isEnabled = true
        }

        mundur5.setOnClickListener {
            val intent = Intent(this, KeluargaActivity4::class.java)
            startActivity(intent)
        }
    }
}