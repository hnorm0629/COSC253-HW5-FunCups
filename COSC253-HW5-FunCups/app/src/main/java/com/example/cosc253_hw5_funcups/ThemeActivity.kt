package com.example.cosc253_hw5_funcups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme)

        title = "Fun Cups Theme"
        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // move to different activity
    fun move(view: View) {
        val intent = when (view.tag) {
            "add" -> Intent(this, AddActivity::class.java)
            "main" -> Intent(this, MainActivity::class.java)
            else -> null
        } // when
    startActivity(intent)
    } // move
} // ThemeActivity