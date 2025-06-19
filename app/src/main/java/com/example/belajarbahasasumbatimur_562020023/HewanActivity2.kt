package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.bumptech.glide.Glide

class HewanActivity2 : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan2)

        val home7 = findViewById<ImageButton>(R.id.home7)
        val burung = findViewById<ImageButton>(R.id.burung)
        val kuda = findViewById<ImageButton>(R.id.kuda)
        val ular = findViewById<ImageButton>(R.id.ular)
        val kerbau = findViewById<ImageButton>(R.id.kerbau)
        val mundur7 = findViewById<ImageButton>(R.id.mundur7)
        val maju6 = findViewById<ImageButton>(R.id.maju6)


        home7.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        mundur7.setOnClickListener {
            val intent = Intent(this, HewanActivity::class.java)
            startActivity(intent)
        }

        maju6.setOnClickListener {
            val intent = Intent(this, HewanActivity3::class.java)
            startActivity(intent)
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.burung1)
            .into(burung)

            burung.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.burung)
                mediaPlayer.start()
                    burung.isEnabled = false
                    burung.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.njara)
            .into(kuda)

            kuda.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kuda)
                mediaPlayer.start()
                    kuda.isEnabled = false
                    kuda.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.kataru)
            .into(ular)

            ular.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ular)
                mediaPlayer.start()
                    ular.isEnabled = false
                    ular.isEnabled = true
            }


        Glide.with(this)
            .asGif()
            .load(R.drawable.karimbua)
            .into(kerbau)

            kerbau.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.kerbau)
                mediaPlayer.start()
                    kerbau.isEnabled = false
                    kerbau.isEnabled = true
            }
    }
}