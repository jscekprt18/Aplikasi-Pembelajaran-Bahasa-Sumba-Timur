package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AngkaActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angka)

        val kembalii = findViewById<ImageButton>(R.id.kembalii)
        val satu = findViewById<ImageButton>(R.id.satu)
        val dua = findViewById<ImageButton>(R.id.dua)
        val tiga = findViewById<ImageButton>(R.id.tiga)
        val empat =findViewById<ImageButton>(R.id.empat)
        val lima = findViewById<ImageButton>(R.id.lima)
        val enam = findViewById<ImageButton>(R.id.enam)
        val tujuh = findViewById<ImageButton>(R.id.tujuh)
        val delapan = findViewById<ImageButton>(R.id.delapan)
        val sembilan = findViewById<ImageButton>(R.id.sembilan)
        val sepuluh = findViewById<ImageButton>(R.id.sepuluh)

        kembalii.setOnClickListener {
            val intent = Intent(this, BelajarActivity2::class.java)
            startActivity(intent)
        }

        satu.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.satu)
            mediaPlayer.start()
            satu.isEnabled = false
            satu.isEnabled = true
        }

        dua.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.dua)
            mediaPlayer.start()
            dua.isEnabled = false
            dua.isEnabled = true
        }

        tiga.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tiga)
            mediaPlayer.start()
            tiga.isEnabled = false
            tiga.isEnabled = true
        }

            empat.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.empat)
                mediaPlayer.start()
                    empat.isEnabled = false
                    empat.isEnabled = true
            }

            lima.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lima)
                mediaPlayer.start()
                    lima.isEnabled = false
                    lima.isEnabled = true
            }

            enam.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.enam)
                mediaPlayer.start()
                    enam.isEnabled = false
                    enam.isEnabled = true
            }

            tujuh.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tujuh)
                mediaPlayer.start()
                    tujuh.isEnabled = false
                    tujuh.isEnabled = true
            }

            delapan.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.delapan)
                mediaPlayer.start()
                    delapan.isEnabled = false
                    delapan.isEnabled = true
            }

            sembilan.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sembilan)
                mediaPlayer.start()
                    sembilan.isEnabled = false
                    sembilan.isEnabled = true
            }

            sepuluh.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sepuh)
                mediaPlayer.start()
                    sepuluh.isEnabled = false
                    sepuluh.isEnabled = true
            }


    }
}