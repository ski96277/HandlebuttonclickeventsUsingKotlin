package com.example.handlebuttonclickeventsusingkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class Second_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
/*
 //one way get text from intent

        var message: String? = getIntent().getStringExtra("value")

        */
//second way get text from intent

        val bundle:Bundle?=intent.extras
        var message:String= bundle!!.getString("value")

        textView_second.text=message;

    }
    fun shareData(view:View){
        var intent:Intent= Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT,textView_second.text)
        intent.type="text/plain"
        startActivity(Intent.createChooser(intent,"share data to.."))
    }
}
