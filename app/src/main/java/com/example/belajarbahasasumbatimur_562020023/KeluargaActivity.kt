package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class KeluargaActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga)



        val opa = findViewById<ImageButton>(R.id.opa)
        val oma = findViewById<ImageButton>(R.id.oma)
        val maju = findViewById<ImageButton>(R.id.mj)
        val mundur = findViewById<ImageButton>(R.id.md)


//untuk kas tampil GIF

        Glide.with(this)
            .asGif()
            .load(R.drawable.boku)
            .into(opa)

        //pas tekan gambar opa suara opa keluar, tapi gambarnya nonaktif sementara
        opa.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.opa)
            mediaPlayer.start()
            opa.isEnabled = false
            opa.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.apu)
            .into(oma)

        oma.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.oma)
            mediaPlayer.start()
            oma.isEnabled = false
            oma.isEnabled = true
        }


        maju.setOnClickListener {
            val intent =  Intent(this, KeluargaActivity2::class.java)
            startActivity(intent)
        }

        mundur.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }
    }
}