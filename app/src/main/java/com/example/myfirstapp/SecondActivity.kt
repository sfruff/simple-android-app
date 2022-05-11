package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Context
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


        val intent = intent.extras?.getString("NAME" , "")


        val sharedPref = getSharedPreferences("myApp", Context.MODE_PRIVATE)
        if(intent != null) {
            sharedPref.edit().putString("NAME", intent).apply()
        }
        val name = sharedPref.getString("NAME", "")

        findViewById<TextView>(R.id.textView).text = "Hello, $name"


        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }

    }
}