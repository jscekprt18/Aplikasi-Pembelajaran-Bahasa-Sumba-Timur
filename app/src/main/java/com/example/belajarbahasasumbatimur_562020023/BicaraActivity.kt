package com.example.belajarbahasasumbatimur_562020023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class BicaraActivity : AppCompatActivity() {
    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bicara)

        pdfView = findViewById(R.id.pdfViewbicara)

        val assetManager = this.assets
        val inputStream = assetManager.open("cakap.pdf")
        pdfView.fromStream(inputStream).load()
    }
}