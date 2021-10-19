package com.mmtypefacesample.apk

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import me.myatminsoe.mdetect.MDetect
import me.myatminsoe.mdetect.Rabbit

class MainActivity : AppCompatActivity() {
    lateinit var typeface: Typeface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt: TextView = findViewById(R.id.txt)

        if(MDetect.isUnicode()) run {
            this.typeface = MainApplication.typefaceManager.getUni()
            txt.text = "သီချင်းကောင်းများ"
            txt.typeface = typeface
            Toast.makeText(this,"Unicode",Toast.LENGTH_SHORT).show()
        }else run {
            this.typeface = MainApplication.typefaceManager.getZgyi()
            txt.text = Rabbit.uni2zg("သီချင်းကောင်းများ")
            txt.typeface = typeface
            Toast.makeText(this,"Zawgyi",Toast.LENGTH_SHORT).show()
        }

    }
}