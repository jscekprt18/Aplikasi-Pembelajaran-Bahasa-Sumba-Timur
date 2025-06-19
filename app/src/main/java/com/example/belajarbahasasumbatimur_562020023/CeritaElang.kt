package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class CeritaElang : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_elang)

        pdfView = findViewById(R.id.pdfViewElang)

        val assetManager = this.assets
        val inputStream = assetManager.open("elang.pdf")
        pdfView.fromStream(inputStream).load()
    }
}