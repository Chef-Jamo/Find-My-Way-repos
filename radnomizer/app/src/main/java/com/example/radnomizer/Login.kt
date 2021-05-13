package com.example.radnomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import  android.widget.Toast
import android.widget.EditText

public class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Login = findViewById<Button>(R.id.btLogin)
        Login.setOnClickListener{
            val db = DBHelper(this)
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }
        val Register = findViewById<Button>(R.id.btNewRegister)
        Register.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }

}