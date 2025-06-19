package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var mediaPlayer: MediaPlayer
    }//u deklarasi fungsi untuk play audio

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.intro)
        mediaPlayer.start()

        val mulai = findViewById<ImageButton>(R.id.mulai)
        val keluar = findViewById<ImageButton>(R.id.keluar)

        mulai.setOnClickListener {
            val intent = Intent(this, PilihActivity::class.java)
            startActivity(intent)
        }

        keluar.setOnClickListener {
            showExitConfirmationDialog()
        }
    }

    override fun onPause() {
        super.onPause()
        if (mediaPlayer.isPlaying) {
            mediaPlayer.pause()
        }
    }//ibaratnya suara akan berhenti sebentar saat kita menekan tombol lain di aktivity tersebut

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }//lagu tdk perlu dimainkan saat user pindah activity. agar tdk ada crash suara.


    private fun showExitConfirmationDialog() {
        val confirmationDialog = AlertDialog.Builder(this)
        confirmationDialog.setMessage("yaahh kau yakin tidak mau belajar lagi?")
        confirmationDialog.setPositiveButton("Yakin, Su Cape") { _, _ ->
            // keluar aplikasi
            finishAffinity()
        }
        confirmationDialog.setNegativeButton("Tidak, Salah tekan hehe") { _, _ ->
            // Batal keluar
        }
        confirmationDialog.show()
    }
}
