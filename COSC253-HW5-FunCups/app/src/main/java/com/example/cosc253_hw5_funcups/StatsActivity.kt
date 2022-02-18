package com.example.cosc253_hw5_funcups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        title = "Fun Cups Stats"
        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // move to different activity
    fun move(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    } // move
} // StatsActivity