package com.example.gotour

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        // Adjust window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the button click listener
        val button = findViewById<Button>(R.id.button11)
        button.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
        // Set up the button click listener
        val image = findViewById<ImageView>(R.id.imageView8)
       image.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

       }
        // Set up the TextView click listener
        val textView = findViewById<TextView>(R.id.textView17)  // Corrected 'textView' to 'TextView'
        textView.setOnClickListener {
            val intent = Intent(this, SeeAll::class.java)  // Corrected 'profile' to 'ProfileActivity' to follow Kotlin naming conventions
            startActivity(intent)
        }
    }
}