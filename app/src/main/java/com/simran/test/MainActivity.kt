package com.pallavi.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.pallavi.test.R

class MainActivity : AppCompatActivity() {
    lateinit var etuser : EditText
    lateinit var etpassword : EditText
    lateinit var btn : Button
    lateinit var tvuserName : TextView
    lateinit var  tvpass : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etuser = findViewById(R.id.etuser)
        etpassword = findViewById(R.id.etpassword)
        btn = findViewById(R.id.btn)
        tvuserName = findViewById(R.id.tvuserName)
        tvpass = findViewById(R.id.tvpass)

        btn.setOnClickListener {
            if(etuser.text.toString().isEmpty()){
                etuser.error = "Enter your name"
            }else if(etpassword.text.isEmpty()){
                etpassword.error = "enter you password"
            }else if(etpassword.text.toString().length < 6){
                etpassword.error = "password should be atleast six words"

            }else{
                var name = etuser.text.toString()
                var password = etpassword.text.toString()
                System.out.println("Name $name password $password")
                tvuserName.setText(name)
                tvpass.setText(password)

            }
        }

    }
}