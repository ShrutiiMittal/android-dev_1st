package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count=0

        val fab=findViewById<FloatingActionButton>(R.id.fab)
        val tfab=findViewById<TextView>(R.id.textView)
        tfab.text=count.toString()
        fab.setOnClickListener {
            count++
            tfab.text=count.toString()
        }

    }
}
