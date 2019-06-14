package com.example.ali.kotlin03_databinding01

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ali.kotlin03_databinding01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bi: ActivityMainBinding //lateint: as the value can't be null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Implement binding*/
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bi.callback = this //set for calling button

    }

    fun submit() {

        if (!bi.txtname.text.isNullOrBlank() && !bi.txtage.text.isNullOrBlank()) {
            bi.viewResult.text = "Name: ${bi.txtname.text} \n Age: ${bi.txtage.text}"
            settingToast("Done").show()
        } else
            settingToast("Fill out all fields!!").show()

    }

    private fun settingToast(msg: String): Toast = Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT)
}
