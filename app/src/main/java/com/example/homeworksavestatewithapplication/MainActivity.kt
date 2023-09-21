package com.example.homeworksavestatewithapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text_view)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        val application = MyApplication.getApp()

        if (application.numberOfClicks != 0) {
            textView.text = application.numberOfClicks.toString()
        }

        fab.setOnClickListener {
            application.addNumber()
            textView.text = application.numberOfClicks.toString()
        }
    }
}
