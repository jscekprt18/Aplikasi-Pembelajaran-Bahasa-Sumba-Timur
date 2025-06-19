package com.example.belajarbahasasumbatimur_562020023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot

class KuisActivity : AppCompatActivity() {

    private var skor = 0 // Variabel untuk simpan skor
    private var urutSoal = 0 //variabel untuk simpan urutan pertanyaan
    private lateinit var daftarPertanyaan: List<Pertanyaan>
    private lateinit var skorTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)
        val kembalii = findViewById<ImageButton>(R.id.kembalii)

        // Inisialisasi skorTextView
        skorTextView = findViewById(R.id.skorTextView)

        // panggil baca dan tampil soal dr firestore
        ambilSoal()

        kembalii.setOnClickListener {
            val intent = Intent(this, PilihActivity::class.java)
            startActivity(intent)
        }

    }


    private fun ambilSoal() {
        val db = FirebaseFirestore.getInstance()
        val koleksiKuis = db.collection("Soal")

        koleksiKuis.get()
            .addOnSuccessListener { querySnapshot: QuerySnapshot? ->

                val listPertanyaan = mutableListOf<Pertanyaan>()
                for (document in querySnapshot!!.documents) {
                    val pertanyaan = document.getString("pertanyaan")
                    val opsiJawaban = document.get("OpsiJawaban") as? List<String>
                    val jawabanBenarIndex = document.getLong("JawabanBenar")?.toInt()

                    if (pertanyaan != null && opsiJawaban != null && jawabanBenarIndex != null) {
                        val pertanyaanObj = Pertanyaan(pertanyaan, opsiJawaban, jawabanBenarIndex)
                        listPertanyaan.add(pertanyaanObj)
                    }
                }

                // acak daftar pertanyaan
                listPertanyaan.shuffle()

                // ambil hanya 10 pertanyaan pertama dr soal
                daftarPertanyaan = listPertanyaan.take(10)

                // Mulai kuis dengan tampil pertanyaan pertama
                loadNextQuestion()
            }
            .addOnFailureListener { e ->
                // Handle untuk atasi masalah dari Firebase Firestore
                e.printStackTrace()
            }
    }



    private fun loadNextQuestion() {
        val pertanyaantxt = findViewById<TextView>(R.id.pertanyaantxt)
        val opsi1btn = findViewById<Button>(R.id.opsi1btn)
        val opsi2btn = findViewById<Button>(R.id.opsi2btn)
        val bahagia = findViewById<ImageView>(R.id.senang)
        val sedih = findViewById<ImageView>(R.id.sedih)



        if (urutSoal < daftarPertanyaan.size) {
            val pertanyaanSaatIni = daftarPertanyaan[urutSoal]
            pertanyaantxt.text = pertanyaanSaatIni.pertanyaan
            opsi1btn.text = pertanyaanSaatIni.opsiJawaban[0]
            opsi2btn.text = pertanyaanSaatIni.opsiJawaban[1]


            bahagia.visibility = View.INVISIBLE
            sedih.visibility = View.INVISIBLE


            opsi1btn.setOnClickListener {
                if (pertanyaanSaatIni.jawabanBenarIndex == 0) {
                    // Jawaban benar, tambah poin
                    tambahkanPoin()

                    val bahagia = findViewById<ImageView>(R.id.senang)
                    bahagia.setImageResource(R.drawable.happy)
                    bahagia.visibility = View.VISIBLE
                    // tampil gambar bahagia
                    bahagia.visibility = View.VISIBLE
                    Glide.with(this)
                        .asGif()
                        .load(R.drawable.happy)
                        .into(bahagia)
                } else {

                    val sedih = findViewById<ImageView>(R.id.sedih)
                    sedih.setImageResource(R.drawable.sad)
                    sedih.visibility = View.VISIBLE
                    // jika jawaban salah, muncul gambar sedih
                    sedih.visibility = View.VISIBLE
                    Glide.with(this)
                        .asGif()
                        .load(R.drawable.sad)
                        .into(sedih)
                }



                // Pindah ke pertanyaan baru
                urutSoal++
                loadNextQuestion()
            }

            opsi2btn.setOnClickListener {
                if (pertanyaanSaatIni.jawabanBenarIndex == 1) {

                    tambahkanPoin()

                    val bahagia1 = findViewById<ImageView>(R.id.senang)
                    bahagia1.setImageResource(R.drawable.happy)
                    bahagia1.visibility = View.VISIBLE

                    bahagia.visibility = View.VISIBLE
                    Glide.with(this)
                        .asGif()
                        .load(R.drawable.happy)
                        .into(bahagia)
                } else {

                    val sedih1 = findViewById<ImageView>(R.id.sedih)
                    sedih1.setImageResource(R.drawable.sad)
                    sedih1.visibility = View.VISIBLE

                    sedih.visibility = View.VISIBLE
                    Glide.with(this)
                        .asGif()
                        .load(R.drawable.sad)
                        .into(sedih)
                }

                urutSoal++
                loadNextQuestion()
            }
        } else {

            showEndOfGame()
        }
    }

    private fun showEndOfGame() {
        skorTextView.text = getString(R.string.skor_label, skor)
    }


    private fun tambahkanPoin() {
        skor += 10
        skorTextView.text = getString(R.string.skor_label, skor)
    }

}







