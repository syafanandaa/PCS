package com.example.aplikasipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance button
        val btnActivity:Button = findViewById(R.id.btn_activity)
        val btnHitung:Button = findViewById(R.id.btn_hitung)

        //button start
        btnHitung.setOnClickListener {
            val intent = Intent(this, HitungActivity::class.java)
            startActivity(intent)
        }

    }
}