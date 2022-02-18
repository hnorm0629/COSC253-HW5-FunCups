package com.example.cosc253_hw5_funcups

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

/*
Hannah Norman
Sophia Petersen
COSC-253 HW5
02/24/22
 */

class MainActivity : AppCompatActivity() {
    private var difficulty = "easy"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // change difficulty of game
    fun changeDifficulty(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            // check which radio button (difficulty level) selected
            when (view.getId()) {
                R.id.easy -> if (checked) difficulty = "easy"
                R.id.medium -> if (checked) difficulty = "medium"
                R.id.hard -> if (checked) difficulty = "hard"
            } // when
        } // if
    } // changeDifficulty

    // move to different activity
    fun move(view: View) {
        val intent = when (view.tag) {
            "game" -> Intent(this, GameActivity::class.java)
                .putExtra("Difficulty", difficulty)
            "theme" -> Intent(this, ThemeActivity::class.java)
            "stats" -> Intent(this, StatsActivity::class.java)
            else -> null
        } // when
        startActivity(intent)
    } // move
} // MainActivity