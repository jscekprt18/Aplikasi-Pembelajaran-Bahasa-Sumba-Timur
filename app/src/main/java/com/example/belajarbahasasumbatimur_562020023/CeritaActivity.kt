package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class CeritaActivity : AppCompatActivity() {
    //variable pdfVie buat kas tampil PDF
    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita)
        pdfView = findViewById(R.id.pdfView)

        val assetManager = this.assets //ini untuk akses file aplikasi
        val inputStream = assetManager.open("kandunu.pdf") //ini untuk buka PDF yng dimaksud
        pdfView.fromStream(inputStream).load() //ini untuk muat pdfnya ke UI


    }
}