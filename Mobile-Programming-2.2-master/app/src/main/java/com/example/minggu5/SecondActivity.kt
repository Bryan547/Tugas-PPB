package com.example.minggu5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private val LOG_TAG = SecondActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView = findViewById<TextView>(R.id.textView)

        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        messageTextView.text = message

    }

    override fun onStart(){
        super.onStart()
        Log.d(LOG_TAG, "INI DI MULAI")
    }

    override fun onPause(){
        super.onPause()
        Log.d(LOG_TAG, "INI DI JEDA")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(LOG_TAG, "INI DI MULAI ULANG")
    }

    override fun onResume(){
        super.onResume()
        Log.d(LOG_TAG, "INI DI LANJUTIN")
    }

    override fun onStop(){
        super.onStop()
        Log.d(LOG_TAG, "INI DI STOP")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(LOG_TAG, "INI DI HANCURIN")
        Log.d(LOG_TAG, "SESINYA SELESAAAIII")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val messageTextView = findViewById<TextView>(R.id.textView)
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        messageTextView.text = message
    }
}