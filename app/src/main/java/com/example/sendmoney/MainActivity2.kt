package com.example.sendmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnsendmoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setContentView(R.layout.activity_main2)
        btnsendmoney = findViewById(R.id.btnsendmoney)
        btnsendmoney.setOnClickListener {
            val intent = Intent(this, sendmoney::class.java)
            startActivity(intent)
        }
    }
}