package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class HewanActivity5 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan5)

        val home10 = findViewById<ImageButton>(R.id.home10)
        val ikan2  = findViewById<ImageButton>(R.id.ikan2)
        val gurita = findViewById<ImageButton>(R.id.gurita)
        val kepiting = findViewById<ImageButton>(R.id.kepiting)
        val udang = findViewById<ImageButton>(R.id.udang)
        val mundur10 = findViewById<ImageButton>(R.id.mundur10)

        home10.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        mundur10.setOnClickListener {
            val intent = Intent(this, HewanActivity4::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.iyangg)
            .into(ikan2)

            ikan2.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ikan)
                mediaPlayer.start()
                    ikan2.isEnabled = false
                    ikan2.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.witta)
            .into(gurita)


            gurita.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.gurita)
                mediaPlayer.start()
                    gurita.isEnabled = false
                    gurita.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.udang1)
            .into(udang)

            udang.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.udang)
                mediaPlayer.start()
                    udang.isEnabled = false
                    udang.isEnabled = true
            }

        Glide.with(this)
            .asGif()
            .load(R.drawable.crab)
            .into(kepiting)

            kepiting.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kepiting)
                mediaPlayer.start()
                    kepiting.isEnabled = false
                    kepiting.isEnabled = true
            }
    }
}