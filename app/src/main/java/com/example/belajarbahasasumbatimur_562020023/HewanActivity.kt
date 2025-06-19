package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class HewanActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan)


        val kupu = findViewById<ImageButton>(R.id.kupu)
        val  babi = findViewById<ImageButton>(R.id.babi)
        val  sapi = findViewById<ImageButton>(R.id.sapi)
        val  mundur6 = findViewById<ImageButton>(R.id.mundur6)
        val  maju5 = findViewById<ImageButton>(R.id.maju5)




        mundur6.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        maju5.setOnClickListener {
            val intent = Intent(this, HewanActivity2::class.java)
            startActivity(intent)
        }

        //buat gambar gif bergerak
        Glide.with(this)
            .asGif()
            .load(R.drawable.kupu2)
            .into(kupu)

        kupu.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kupu)
            mediaPlayer.start()
            kupu.isEnabled = false
            kupu.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.wawi)
            .into(babi)

        babi.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.babi)
            mediaPlayer.start()
            babi.isEnabled = false
            babi.isEnabled = true
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.hapi2)
            .into(sapi)

            sapi.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sapi)
                mediaPlayer.start()
                    sapi.isEnabled = false
                    sapi.isEnabled = true
            }

    }
}