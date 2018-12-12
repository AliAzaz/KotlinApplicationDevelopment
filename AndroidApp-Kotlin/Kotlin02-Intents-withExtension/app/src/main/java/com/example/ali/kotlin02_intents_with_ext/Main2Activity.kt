package com.example.ali.kotlin02_intents_with_ext

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txt_data.text  = intent.extras.get("data").toString()

        btn_back.setOnClickListener { view ->
            finish()
            startActivity(Intent(view.context,MainActivity::class.java))

                                        /*OR*/

//            startActivity(Intent(this@Main2Activity,MainActivity::class.java))
        }

    }
}
