package com.example.aplikasipcs

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val btnProses = findViewById(R.id.btn_proses) as Button
        val txtHasil = findViewById(R.id.txtHasil) as TextView
        val txtVar1 = findViewById(R.id.txtVar1) as EditText
        val txtVar2 = findViewById(R.id.txtVar2) as EditText

        btnProses.setOnClickListener {
            val var1:Int = txtVar1.text.toString().toInt()
            val var2:Int = txtVar2.text.toString().toInt()

            val hasil : Int = var1 + var2

            txtHasil.text = hasil.toString()
        }


    }
}