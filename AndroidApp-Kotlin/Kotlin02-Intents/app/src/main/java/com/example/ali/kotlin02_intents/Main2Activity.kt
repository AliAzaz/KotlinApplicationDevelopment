package com.example.ali.kotlin02_intents

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class Main2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn_back = findViewById(R.id.btn_back)
        var txtview = findViewById(R.id.txt_data) as TextView

        txtview.text  = intent.extras.get("data").toString()

        btn_back.setOnClickListener { view ->
            finish()
            startActivity(Intent(view.context,MainActivity::class.java))

                                        /*OR*/

//            startActivity(Intent(this@Main2Activity,MainActivity::class.java))
        }

    }
}
