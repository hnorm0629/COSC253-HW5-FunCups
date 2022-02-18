package com.example.cosc253_hw5_funcups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        title = "Add Theme"
        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // save theme and return to themes list
    fun save(view: View) {

        /* ... other stuff goes up here; will look similar to save() in LogActivity in HW4 */

        // move later, for linking purposes now
        val intent = Intent(this, ThemeActivity::class.java)
        startActivity(intent)
    } // save
} // AddActivity