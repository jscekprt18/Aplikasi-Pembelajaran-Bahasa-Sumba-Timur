package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class CeritaKerbau : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_kerbau)

        pdfView = findViewById(R.id.pdfViewKerbau)

        val assetManager = this.assets
        val inputStream = assetManager.open("kerbau.pdf")
        pdfView.fromStream(inputStream).load()
    }
}