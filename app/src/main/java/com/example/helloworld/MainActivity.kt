package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button) as Button
        val textview = findViewById(R.id.aisatsutextView) as TextView
        textview.text = "Hello World!!"

        button.setOnClickListener { onClickButton() }
    }

    val onClickButton = {
        val textView = findViewById(R.id.aisatsutextView) as TextView
        textView.text = "Change!!"
    }
}
