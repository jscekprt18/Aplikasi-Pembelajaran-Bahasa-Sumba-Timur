package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class CeritaKabihu : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_kabihu)

        pdfView = findViewById(R.id.pdfViewKabihu)

        val assetManager = this.assets
        val inputStream = assetManager.open("kabihu.pdf")
        pdfView.fromStream(inputStream).load()


    }
}