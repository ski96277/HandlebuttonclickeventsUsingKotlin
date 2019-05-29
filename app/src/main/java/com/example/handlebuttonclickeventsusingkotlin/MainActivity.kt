package com.example.handlebuttonclickeventsusingkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //one way to click button
        button_Toast_show.setOnClickListener {
            Toast.makeText(this,"Hello kotlin",Toast.LENGTH_SHORT).show()
        }
    }
    //Second way to click button

    fun onclick_Handler(view: View) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()

        //get text from Edit text
        var message: String = editText_first.text.toString()

        var intent: Intent = Intent(this, Second_Activity::class.java).putExtra("value",message)
        startActivity(intent)

    }
}
