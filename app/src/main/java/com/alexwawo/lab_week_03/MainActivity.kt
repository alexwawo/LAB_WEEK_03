
package com.alexwawo.lab_week_03

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DEBUG", "MainActivity: onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("DEBUG", "MainActivity: onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DEBUG", "MainActivity: onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DEBUG", "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DEBUG", "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DEBUG", "MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG", "MainActivity: onDestroy")
    }
}