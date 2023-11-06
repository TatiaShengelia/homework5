package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register()
        login()
    }

    private fun register(){
        findViewById<AppCompatButton>(R.id.button_register).setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                setContentView(R.layout.register)
            }
        })
    }

    private fun login(){
        findViewById<AppCompatButton>(R.id.button_login).setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                setContentView(R.layout.login)
            }
        })
    }
}