package com.example.ali.kotlin02_intents_with_library

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* btn_next is already casted to a proper type of "Button"
         instead of being a "View"*/

        btn_next.text = "Next Activity"

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
