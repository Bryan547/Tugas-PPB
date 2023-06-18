package com.example.materi_23
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openMovie(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://genius.com/Travis-scott-coffee-bean-lyrics")
        startActivity(intent)
    }

    fun openLany(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://store.steampowered.com/app/1328670/Mass_Effect_Legendary_Edition/")
        startActivity(intent)
    }
}