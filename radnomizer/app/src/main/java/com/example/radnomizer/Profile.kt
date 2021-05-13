package com.example.radnomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val MealLog = findViewById<Button>(R.id.btProfileMealLog)

        MealLog.setOnClickListener {
            val intent = Intent(this, MealLog::class.java)
            startActivity(intent)
        }

        val Progress = findViewById<Button>(R.id.btProfileProgress)

        Progress.setOnClickListener{
            val intent = Intent(this, Progress::class.java)
            startActivity(intent)
        }

    }
}