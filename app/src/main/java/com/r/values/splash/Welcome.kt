package com.r.values.splash


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Welcome :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)
        val buttonNext = findViewById<Button>(R.id.btnContinue) as Button

        buttonNext.setOnClickListener {
            val process_activity = Intent(this,MainProcess::class.java)
            startActivity(process_activity)
        }
    }
}