package com.example.ali.kotlin01_helloapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt_view : TextView = findViewById(R.id.txt_view) as TextView
        var btn_click = findViewById(R.id.btn_click)

        btn_click.setOnClickListener {view -> Toast.makeText(view.context,"Hello First Kotlin Toast",Toast.LENGTH_LONG).show(); txt_view.text = "Hello First Kotlin Toast"}
    }
}
