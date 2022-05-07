package com.example.sendmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sendmoney : AppCompatActivity() {
    lateinit var btncancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)

        btncancel = findViewById(R.id.btncancel)
        btncancel.setOnClickListener {
            val intent = Intent(this, sendmoney::class.java)
            startActivity(intent)
        }
    }
}