package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var start: Button? = null
    private var stop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start = findViewById(R.id.startButton)
        stop = findViewById(R.id.stopButton)
    }

    override fun onStart() {
        super.onStart()

        start!!.setOnClickListener {
            startService(Intent(this,MyService::class.java))
        }

        stop!!.setOnClickListener {
            stopService(Intent(this,MyService::class.java))
        }
    }
}