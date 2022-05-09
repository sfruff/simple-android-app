package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView1)
        imageView.setOnClickListener {
            val name = findViewById<EditText>(R.id.editName).text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)
        }


        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        imageView2.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("NAME", "")
            startActivity(intent)
        }

    }
}