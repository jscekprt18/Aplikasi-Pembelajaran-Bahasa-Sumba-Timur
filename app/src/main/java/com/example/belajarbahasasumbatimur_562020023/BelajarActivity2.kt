package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.belajarbahasasumbatimur_562020023.MainActivity.Companion.mediaPlayer

class BelajarActivity2 : AppCompatActivity() {


    override fun onDestroy() {
        super.onDestroy()
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
            mediaPlayer.release()
        }
    }

    override fun onPause() {
        super.onPause()
        if (mediaPlayer.isPlaying) {
            mediaPlayer.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar2)

        val tmblkeluarga = findViewById<ImageButton>(R.id.klrg)
        val tmblbadan = findViewById<ImageButton>(R.id.bdn)
        val tmblangka = findViewById<ImageButton>(R.id.angka)
        val tmblhewan = findViewById<ImageButton>(R.id.hwn)
        val tmblwarna =  findViewById<ImageButton>(R.id.wrn)
        val tmblrasa = findViewById<ImageButton>(R.id.rasa)
        val tmblaktivitas = findViewById<ImageButton>(R.id.aktivitas)
        val tmblbicara = findViewById<ImageButton>(R.id.bicara)
        val tmblcuaca = findViewById<ImageButton>(R.id.cuaca)
        val tmbltempat = findViewById<ImageButton>(R.id.tempat)
        val mundur = findViewById<ImageButton>(R.id.kmbl)
        val maju = findViewById<ImageButton>(R.id.lnjt)

        mundur.setOnClickListener {
            val intent = Intent(this, PilihActivity::class.java)
            startActivity(intent)
        }

        maju.setOnClickListener {
            val intent = Intent ( this, BelajarActivity4::class.java)
            startActivity(intent)
        }

        tmblkeluarga.setOnClickListener{
            val intent = Intent (this, KeluargaActivity::class.java)
            startActivity(intent)
        }

        tmblbadan.setOnClickListener{
            val intent = Intent( this, TubuhActivity2::class.java)
            startActivity(intent)
        }

        tmblangka.setOnClickListener{
            val intent = Intent(this, AngkaActivity::class.java)
            startActivity(intent)
        }

        tmblhewan.setOnClickListener{
            val intent = Intent (this, HewanActivity::class.java)
            startActivity(intent)
        }

        tmblwarna.setOnClickListener{
            val intent = Intent (this, WarnaActivity::class.java)
            startActivity(intent)
        }

        tmblrasa.setOnClickListener{
            val intent =Intent (this, PerasaanActivity::class.java)
            startActivity(intent)
        }

        tmblaktivitas.setOnClickListener{
            val intent = Intent (this, AktifActivity::class.java)
            startActivity(intent)
        }

        tmblbicara.setOnClickListener{
            val intent = Intent(this, BicaraActivity::class.java)
            startActivity(intent)
        }

        tmblcuaca.setOnClickListener{
            val intent = Intent( this, AlamActivity::class.java)
            startActivity(intent)
        }

        tmbltempat.setOnClickListener {
            val intent = Intent( this, TempatActivity::class.java)
            startActivity(intent)
        }
    }
}