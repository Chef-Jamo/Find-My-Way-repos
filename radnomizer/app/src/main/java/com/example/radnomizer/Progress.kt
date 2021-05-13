package com.example.radnomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Progress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        val profile = findViewById<Button>(R.id.btProgressProfile)
        profile.setOnClickListener {
            val intent = Intent(this, Profile:: class.java)
            startActivity(intent)
        }

        val meallog = findViewById<Button>(R.id.btMealLog)
        meallog.setOnClickListener {
            val intent = Intent(this, MealLog::class.java)
            startActivity(intent)
        }
    }
}