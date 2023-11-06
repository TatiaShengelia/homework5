package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        next()
    }

    private fun next(){
        findViewById<AppCompatButton>(R.id.button_next).setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                setContentView(R.layout.register2)
            }
        })
    }
}