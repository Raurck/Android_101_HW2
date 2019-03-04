package com.example.homework_2

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var song = Song()
        Log.d(this.localClassName, song.toString())
    }
}
