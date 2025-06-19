package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AktifActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktif)

        val tdr  = findViewById<ImageButton>(R.id.tdr)
        val  bgn = findViewById<ImageButton>(R.id.bgn)
        val  mkn = findViewById<ImageButton>(R.id.mkn)
        val  mnm = findViewById<ImageButton>(R.id.mnm)
        val ddk  = findViewById<ImageButton>(R.id.ddk)
        val jln  = findViewById<ImageButton>(R.id.jln)
        val kmbl99  = findViewById<ImageButton>(R.id.kmbl99)
        val lnjt99  = findViewById<ImageButton>(R.id.lnjt99)

        kmbl99.setOnClickListener {
                val intent = Intent(this, BelajarActivity2::class.java)
                startActivity(intent)
            }

        lnjt99.setOnClickListener {
            val intent = Intent(this, AktifActivity2::class.java)
            startActivity(intent)
        }


            tdr.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tidur)
                mediaPlayer.start()
                    tdr.isEnabled = false
                    tdr.isEnabled = true
            }

            bgn.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bangun)
                mediaPlayer.start()
                    bgn.isEnabled = false
                    bgn.isEnabled = true
            }

            ddk.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.duduk)
                mediaPlayer.start()
                    ddk.isEnabled = false
                    ddk.isEnabled = true
            }

            jln.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.jlnn)
                mediaPlayer.start()
                    jln.isEnabled = false
                    jln.isEnabled = true
            }

            mkn.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.makan)
                mediaPlayer.start()
                    mkn.isEnabled = false
                    mkn.isEnabled = true
            }

            mnm.setOnClickListener {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.minum)
                mediaPlayer.start()
                    mnm.isEnabled = false
                    mnm.isEnabled = true
            }
    }
}