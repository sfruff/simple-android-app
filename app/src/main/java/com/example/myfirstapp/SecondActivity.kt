package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        findViewById<TextView>(R.id.textView).text = "Hello, " + intent.extras?.getString("NAME" , "")

        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }

    }
}