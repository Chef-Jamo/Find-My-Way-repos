package com.example.radnomizer

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.txtEmailLogin
import kotlinx.android.synthetic.main.activity_main.txtPasswordLogin


class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Registerbutton = findViewById<Button>(R.id.btRegisterUser)

        Registerbutton.setOnClickListener{
            val db = DBHelper(this)
            var useremail = txtEmailLogin.text.toString()
            var userfname = txtFname.text.toString()
            var userlname = txtLname.text.toString()
            var userpassword = txtPasswordLogin.text.toString()

            if(useremail.equals("")||userfname.equals("")||userlname.equals("")||userpassword.equals(""))
            {
                Toast.makeText(applicationContext,"Please fill all the fields",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var test = db.insertData(useremail,userfname,userlname,userpassword)
                if(test ==true )
                {
                    Toast.makeText(applicationContext,"This worked finally",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                }else
                {
                    Toast.makeText(applicationContext,"Fuckkkkkkkkkkkkkkkk",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
