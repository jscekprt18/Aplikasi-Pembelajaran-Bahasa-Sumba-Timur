package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class CeritaSuanggi : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_suanggi)

        pdfView = findViewById(R.id.pdfViewSuanggi)

        val assetManager = this.assets
        val inputStream = assetManager.open("raksasa.pdf")
        pdfView.fromStream(inputStream).load()
    }
}