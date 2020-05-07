package com.r.values.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeScreen = Handler()

        welcomeScreen.postDelayed({
            val afterSplash = Intent(this,Welcome::class.java)
            startActivity(afterSplash)
        },4000)
    }
}
