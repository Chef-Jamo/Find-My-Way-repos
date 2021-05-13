package com.example.radnomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val Save = findViewById<Button>(R.id.btSave)

        Save.setOnClickListener{
            val intent = Intent(this, MealLog::class.java)
            startActivity(intent)
        }

    }
}