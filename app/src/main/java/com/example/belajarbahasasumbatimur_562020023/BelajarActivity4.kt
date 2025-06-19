package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BelajarActivity4 : AppCompatActivity() {


    override fun onDestroy() {
        super.onDestroy()
        if (MainActivity.mediaPlayer.isPlaying) {
            MainActivity.mediaPlayer.stop()
            MainActivity.mediaPlayer.release()
        }
    }

    override fun onPause() {
        super.onPause()
        if (MainActivity.mediaPlayer.isPlaying) {
            MainActivity.mediaPlayer.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        if (!MainActivity.mediaPlayer.isPlaying) {
            MainActivity.mediaPlayer.start()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar4)

        val mundur1 = findViewById<ImageButton>(R.id.kmbl)
        val tmblwaktu = findViewById<ImageButton>(R.id.waktu)
        val tmblkata = findViewById<ImageButton>(R.id.kata)
        val tmblcerita = findViewById<ImageButton>(R.id.cerita)
        val tmblseni = findViewById<ImageButton>(R.id.seni)

        mundur1.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        tmblwaktu.setOnClickListener {
            val intent = Intent(this, WaktuActivity::class.java)
            startActivity(intent)
        }

        tmblkata.setOnClickListener {
            val intent = Intent(this, KataActivity::class.java)
            startActivity(intent)
        }

        tmblcerita.setOnClickListener {
            val intent = Intent(this, MainCerita::class.java)
            startActivity(intent)
        }

        tmblseni.setOnClickListener {
            val intent = Intent(this, SeniActivity::class.java)
            startActivity(intent)
        }
    }
}