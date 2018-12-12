package com.example.ali.kotlin02_intents

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Toast

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_next = findViewById(R.id.btn_next)
        val edit_data = findViewById(R.id.edit_data) as EditText

        btn_next.setOnClickListener { view ->
            if (!edit_data.text.isEmpty()) {
                Toast.makeText(view.context, edit_data.text, Toast.LENGTH_SHORT).show()
                finish()
                nextActivity(view.context, edit_data.text)
            }
        }
    }

    fun nextActivity(context: Context, data: Editable) =  startActivity(Intent(context, Main2Activity::class.java)
            .putExtra("data", data))
}
