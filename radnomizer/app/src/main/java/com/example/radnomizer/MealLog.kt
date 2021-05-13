package com.example.radnomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_test.*

class MealLog : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val profile = findViewById<Button>(R.id.btMealLogProfile)
        profile.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val test = findViewById<Button>(R.id.btSaveMeal)
        test.setOnClickListener{
            val db = DBHelper(this)
            val MealID = 0
            val MealNo = txtMealNo.text.toString().toInt()
            val FoodD = txtFoddD.text.toString()
            val carbs = txtCarbs.text.toString().toDouble()
            val fat = txtfats.text.toString().toDouble()
            val protien = txtCarbs.text.toString().toDouble()

            //var insert = db.insertDailyMeal(MealID.toString(), MealNo, FoodD,carbs,fat,protien)
        }

        val progress = findViewById<Button>(R.id.btMealLogProgress)
        progress.setOnClickListener {
            val intent = Intent(this, progress::class.java)
            startActivity(intent)
        }

    }
}
