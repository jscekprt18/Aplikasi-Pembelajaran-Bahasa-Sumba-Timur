package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PerasaanActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perasaan)

        val senang  = findViewById<ImageButton>(R.id.senang)
        val  sedih  = findViewById<ImageButton>(R.id.sedih)
        val  sakit = findViewById<ImageButton>(R.id.sakit)
        val  hoput = findViewById<ImageButton>(R.id.hoput)
        val  marah = findViewById<ImageButton>(R.id.marah)
        val pulang  = findViewById<ImageButton>(R.id.balik1)

        pulang.setOnClickListener {
                val intent = Intent(this, BelajarActivity2::class.java)
                startActivity(intent)
            }


            senang.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.senang)
                mediaPlayer.start()
                    senang.isEnabled = false
                    senang.isEnabled = true
            }

                sedih.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sedih)
                    mediaPlayer.start()
                        sedih.isEnabled = false
                        sedih.isEnabled = true
                }

                sakit.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sakit)
                    mediaPlayer.start()
                        sakit.isEnabled = false
                        sakit.isEnabled = true
                }

                hoput.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.hoput)
                    mediaPlayer.start()
                        hoput.isEnabled = false
                        hoput.isEnabled = true
                }

                marah.setOnClickListener {
                    mediaPlayer = MediaPlayer.create(applicationContext, R.raw.marah)
                    mediaPlayer.start()
                        marah.isEnabled = false
                        marah.isEnabled = true
                }
    }
}