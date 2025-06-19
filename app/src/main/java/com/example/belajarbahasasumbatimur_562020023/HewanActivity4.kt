package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class HewanActivity4 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan4)

        val home9 = findViewById<ImageButton>(R.id.home9)
        val anjing = findViewById<ImageButton>(R.id.anjing)
        val kambing  = findViewById<ImageButton>(R.id.kambing)
        val kucing = findViewById<ImageButton>(R.id.kucing)
        val mundur9 = findViewById<ImageButton>(R.id.mundur9)
        val maju8 = findViewById<ImageButton>(R.id.maju8)

        home9.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }


        mundur9.setOnClickListener {
            val intent = Intent(this, HewanActivity3::class.java)
            startActivity(intent)
        }

        maju8.setOnClickListener {
            val intent = Intent(this, HewanActivity5::class.java)
            startActivity(intent)
        }


        Glide.with(this)
            .asGif()
            .load(R.drawable.ahu1)
            .into(anjing)

            anjing.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.anjing)
                mediaPlayer.start()
                    anjing.isEnabled = false
                    anjing.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.kamambi)
            .into(kambing)
            kambing.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kambing)
                mediaPlayer.start()
                    kambing.isEnabled = false
                    kambing.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.miaw)
            .into(kucing)
            kucing.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kucing)
                mediaPlayer.start()
                    kucing.isEnabled = false
                    kucing.isEnabled = true
            }

    }
}