package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class KeluargaActivity2 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga2)

        val home2 = findViewById<ImageButton>(R.id.home2)
        val bapak = findViewById<ImageButton>(R.id.bapa)
        val mama = findViewById<ImageButton>(R.id.mama)
        val maju2 = findViewById<ImageButton>(R.id.maju2)
        val mundur2 = findViewById<ImageButton>(R.id.mundur2)

        home2.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.ama)
            .into(bapak)

        bapak.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bapa)
            mediaPlayer.start()
            bapak.isEnabled = false
            bapak.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.ina)
            .into(mama)

        mama.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.mama)
            mediaPlayer.start()
            mama.isEnabled = false
            mama.isEnabled = true
        }

        maju2.setOnClickListener {
            val intent =  Intent(this, KeluargaActivity3::class.java)
            startActivity(intent)
        }

        mundur2.setOnClickListener {
            val intent = Intent(this, KeluargaActivity::class.java)
            startActivity(intent)
        }


    }
}